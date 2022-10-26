package application;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.math.RoundingMode;
import java.net.URI;
import java.text.DecimalFormat;

public class getApiFile {
    public static String result() {
                String allResult;

                HttpClient httpclient = HttpClients.createDefault();
                allResult = "";
                try
                {
                    URIBuilder builder = new URIBuilder("https://desenvolvimento-prediction.cognitiveservices.azure.com/customvision/v3.0/Prediction/0cae8647-5e8f-4b3e-8293-31191a0c3c3c/classify/iterations/Iteration9/image");

                    URI uri = builder.build();
                    HttpPost request = new HttpPost(uri);
                    request.setHeader("Content-Type", "application/octet-stream");
                    request.setHeader("Prediction-key", "75ab507a8d6e43d5a6ff7eeb17c522e1");


                    File file = new File("C:\\Users\\zExtr\\IdeaProjects\\Laboratorio-de-programacao\\JavaCodes\\All Files IC\\ApplicationSamu\\images\\sanpshot.jpg");
                    FileEntity reqEntity = new FileEntity(file);
                    request.setEntity(reqEntity);

                    HttpResponse response = httpclient.execute(request);
                    HttpEntity entity = response.getEntity();

                    if (entity != null)
                    {
                        allResult = EntityUtils.toString(entity);

                    }
                }
                catch (Exception e)
                {
                    allResult = e.getMessage();
                }
                return allResult;
    }

    public static String filterResult(){
        String finalResult = "";

        DecimalFormat df = new DecimalFormat("#.##%");
        df.setRoundingMode(RoundingMode.DOWN);
        String allResult []= new String[5];

        String jsonString = getApiFile.result();
        JSONObject obj = new JSONObject(jsonString);
        JSONArray arr = obj.getJSONArray("predictions");
        for (int i = 0; i < arr.length(); i++)
        {
            String tagName = arr.getJSONObject(i).getString("tagName") + ": ";
            String probability = df.format(arr.getJSONObject(i).getDouble("probability"));
            allResult[i] = tagName.concat(probability);
        }
        for (int i = 0; i < arr.length(); i++)
        {
            finalResult = finalResult.concat(allResult[i] + "\n");
        }
        return finalResult;

    }
    }

