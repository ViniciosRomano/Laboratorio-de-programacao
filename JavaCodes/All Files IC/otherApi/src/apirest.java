import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest;
import java.time.Duration;
import org.json.*;


public class apirest {
    public static final String URL_GET = "https://ikhha3ijx9.execute-api.us-east-1.amazonaws.com/dev/getSensors";
    public static String StringAPI;

    public static void main(String[] args) throws IOException, InterruptedException {

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





        System.out.println(StringAPI);




        String jsonString = apirest.StringAPI ; //assign your JSON String here
        JSONObject obj = new JSONObject(jsonString);

        String temperature  = obj.getJSONObject("device_data").getString("temperature");
        String oximeter  = obj.getJSONObject("device_data").getString("oximeter");
        String frequency  = obj.getJSONObject("device_data").getString("oximeter");

        System.out.println(temperature);
        System.out.println(oximeter);
        System.out.println(frequency);


    }
}