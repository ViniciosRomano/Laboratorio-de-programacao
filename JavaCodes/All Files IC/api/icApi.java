package api;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class icApi {
    public static void main(String[] args) {
        // // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)
                HttpClient httpclient = HttpClients.createDefault();

                try
                {
                    URIBuilder builder = new URIBuilder("https://desenvolvimento-prediction.cognitiveservices.azure.com/customvision/v3.0/Prediction/0cae8647-5e8f-4b3e-8293-31191a0c3c3c/classify/iterations/Iteration4/url");

                   // builder.setParameter("application", "{string}");

                    URI uri = builder.build();
                    HttpPost request = new HttpPost(uri);
                    request.setHeader("Content-Type", "application/json");
                    request.setHeader("Prediction-key", "75ab507a8d6e43d5a6ff7eeb17c522e1");


                    // Request body
                    StringEntity reqEntity = new StringEntity("{\"Url\": \"https://static1.minhavida.com.br/conditions/f9/77/07/d8/58652-orig-1.jpg\"}");
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

