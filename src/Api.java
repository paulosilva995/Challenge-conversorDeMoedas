import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.net.http.HttpClient.newHttpClient;

public class Api {
    public double convertCoin(String baseCode, String targetCode) throws IOException, InterruptedException {
        Key key = new Key();
        HttpClient client = newHttpClient();
        URI uri = URI.create("https://v6.exchangerate-api.com/v6/%s/pair/%s/%s".formatted(key.getKey(), baseCode, targetCode));
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(response.body(), ConvertedCoin.class).conversion_rate();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Api api = new Api();
        new Key();
        //System.out.println(key.getKey());
        api.convertCoin("USD", "BRL");
        //System.out.println(coinResults);
    }
}
