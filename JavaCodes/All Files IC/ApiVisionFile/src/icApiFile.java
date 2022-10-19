import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.net.URI;


public class icApiFile {
    public static void main(String[] args) {
        // // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
                HttpClient httpclient = HttpClients.createDefault();

                try
                {
                    URIBuilder builder = new URIBuilder("https://desenvolvimento-prediction.cognitiveservices.azure.com/customvision/v3.0/Prediction/0cae8647-5e8f-4b3e-8293-31191a0c3c3c/classify/iterations/Iteration4/image");

                   // builder.setParameter("application", "{string}");

                    URI uri = builder.build();
                    HttpPost request = new HttpPost(uri);
                    request.setHeader("Content-Type", "application/octet-stream");
                    request.setHeader("Prediction-key", "75ab507a8d6e43d5a6ff7eeb17c522e1");


                    // Request body
                    File file = new File("C:\\Users\\zExtr\\Desktop\\Exibir\\Ulcera99%.png");
                    FileEntity reqEntity = new FileEntity(file);
                    request.setEntity(reqEntity);

                    HttpResponse response = httpclient.execute(request);
                    HttpEntity entity = response.getEntity();

                    if (entity != null)
                    {
                        System.out.println(EntityUtils.toString(entity));
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }

