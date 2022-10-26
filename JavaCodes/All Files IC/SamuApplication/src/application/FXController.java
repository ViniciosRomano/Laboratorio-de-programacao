package application;

import application.utils.Utils;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class FXController
{
	Mat matrix = null;
	@FXML
	private Button button;
	@FXML
	private ImageView currentFrame;
	@FXML
	private Text temperatura;
	@FXML
	private Text ox;
	@FXML
	private Text bpm;
	@FXML
	private Text analise;
	
	
	private ScheduledExecutorService timer;
	private final VideoCapture capture = new VideoCapture(cameraId);
	private boolean cameraActive = false;
	private static final int cameraId = 0;

//	public static final String URL_GET = "https://ikhha3ijx9.execute-api.us-east-1.amazonaws.com/dev/getSensors";
//	public static String StringAPI;


	@FXML
	protected void startCamera() throws IOException, InterruptedException {
		if (!this.cameraActive)
		{
			this.capture.open(cameraId);

			if (this.capture.isOpened())
			{

				FXController printScreen = new FXController();
				printScreen.capureSnapShot();
				printScreen.saveImage();


				this.analise.setText(getApiFile.filterResult());
				this.temperatura.setText(apirestList.temperatureResult());
				this.ox.setText(apirestList.oximeterResult());
				this.bpm.setText(apirestList.frequencyResult());


				this.cameraActive = true;

				Runnable frameGrabber = () -> {
					Mat frame = grabFrame();
					Image imageToShow = Utils.mat2Image(frame);
					updateImageView(currentFrame, imageToShow);
				};

				this.timer = Executors.newSingleThreadScheduledExecutor();
				this.timer.scheduleAtFixedRate(frameGrabber, 0, 33, TimeUnit.MILLISECONDS);
				this.button.setText("Desligar Camera");
			}
			else
			{
				System.err.println("Impossible to open the camera connection...");
			}
		}
		else
		{
			this.cameraActive = false;
			this.button.setText("Ligar Camera");
			this.stopAcquisition();
		}
	}

	private Mat grabFrame()
	{
		Mat frame = new Mat();
		if (this.capture.isOpened())
		{
			try
			{
				// read the current frame
				this.capture.read(frame);
				
				// if the frame is not empty, process it

			}
			catch (Exception e)
			{
				// log the error
				System.err.println("Exception during the image elaboration: " + e);
			}
		}
		
		return frame;
	}
	private void stopAcquisition()
	{
		if (this.timer!=null && !this.timer.isShutdown())
		{
			try
			{
				// stop the timer
				this.timer.shutdown();
				this.timer.awaitTermination(60, TimeUnit.MILLISECONDS);
			}
			catch (InterruptedException e)
			{
				// log any exception
				System.err.println("Exception in stopping the frame capture, trying to release the camera now... " + e);
			}
		}
		
		if (this.capture.isOpened())
		{
			// release the camera
			this.capture.release();
		}
	}

	private void updateImageView(ImageView view, Image image)
	{
		Utils.onFXThread(view.imageProperty(), image);
	}
	protected void setClosed()
	{
		this.stopAcquisition();
	}

	//print
	public void capureSnapShot() {
		//VideoCapture capture = new VideoCapture(cameraId); create erro
		// Reading the next video frame from the camera
		Mat matrix = new Mat();

		// If camera is opened
		if( capture.isOpened()) {
			// If there is next video frame
			if (capture.read(matrix)) {
				// Creating BuffredImage from the matrix
				BufferedImage image = new BufferedImage(matrix.width(),matrix.height(), BufferedImage.TYPE_3BYTE_BGR);

				WritableRaster raster = image.getRaster();
				DataBufferByte dataBuffer = (DataBufferByte) raster.getDataBuffer();
				byte[] data = dataBuffer.getData();
				matrix.get(0, 0, data);
				this.matrix = matrix;

				// Creating the Writable Image
				SwingFXUtils.toFXImage(image, null);
			}
		}
	}
	public void saveImage() {
		// Saving the Image
		String file = "C:\\Users\\zExtr\\IdeaProjects\\Laboratorio-de-programacao\\JavaCodes\\All Files IC\\SamuApplication\\images\\sanpshot.jpg";

		// Instantiating the imgcodecs class
		new Imgcodecs();

		// Saving it again
		Imgcodecs.imwrite(file, matrix);
	}
}