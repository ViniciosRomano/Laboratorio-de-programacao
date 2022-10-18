package api;

import java.net.URI;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class icApi {
    public static void main(String[] args) {
        // // This sample uses the Apache HTTP client from HTTP Components (http://hc.apache.org/httpcomponents-client-ga/)


                HttpClient httpclient = HttpClients.createDefault();

                try
                {
                    URIBuilder builder = new URIBuilder("https://*.cognitiveservices.azure.com/customvision/v3.3/Training/projects/{projectId}/iterations/{iterationId}/performance/images");

                    builder.setParameter("tagIds", "{array}");
                    builder.setParameter("orderBy", "{string}");
                    builder.setParameter("take", "50");
                    builder.setParameter("skip", "0");

                    URI uri = builder.build();
                    HttpGet request = new HttpGet(uri);
                    request.setHeader("Training-key", "{subscription key}");


                    // Request body
                    StringEntity reqEntity = new StringEntity("{body}");
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

