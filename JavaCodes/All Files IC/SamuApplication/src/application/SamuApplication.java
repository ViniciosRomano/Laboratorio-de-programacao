package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.opencv.core.Core;

import java.util.Objects;


public class SamuApplication extends Application
{
	@Override
	public void start(Stage primaryStage) {
		try
		{
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
			BorderPane rootElement = loader.load();
			Scene scene = new Scene(rootElement, 1280, 720);
			scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("application.css")).toExternalForm());
			primaryStage.setTitle("IC-SAMU-FIAP");
			primaryStage.setScene(scene);
			primaryStage.show();
			FXController controller = loader.getController();
			primaryStage.setOnCloseRequest((we -> controller.setClosed()));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}


	public static void main(String[] args)
	{
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		launch(args);
	}
}