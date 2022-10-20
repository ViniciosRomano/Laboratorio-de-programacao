import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.time.Duration;
import org.json.*;

public class apirestList {
    public static final String URL_GET = "https://ikhha3ijx9.execute-api.us-east-1.amazonaws.com/dev/getSensors";
    public static String StringAPI;

    public static String result() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_GET))
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        //System.out.println(response.body());

        StringAPI=response.body();

        StringAPI = StringAPI.replace("[", "");
        StringAPI = StringAPI.replace("]", "");

        //System.out.println(StringAPI);
        return StringAPI;
    }
    public static String temperatureResult() throws IOException, InterruptedException {
        String jsonString = apirestList.result() ;
        JSONObject obj = new JSONObject(jsonString);

        String temperature  = obj.getJSONObject("device_data").getString("temperature");
        return temperature;
    }

    public static String oximeterResult() throws IOException, InterruptedException {
        String jsonString = apirestList.result() ;
        JSONObject obj = new JSONObject(jsonString);

        String oximeter  = obj.getJSONObject("device_data").getString("oximeter");
        return oximeter;
    }

    public static String frequencyResult() throws IOException, InterruptedException {
        String jsonString = apirestList.result() ;
        JSONObject obj = new JSONObject(jsonString);

        String frequency  = obj.getJSONObject("device_data").getString("frequency");
        return frequency;
    }

}
