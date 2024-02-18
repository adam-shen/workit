package Planit;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ExerciseLogApiService {

    private static final String API_URL = "https://api.ninjaexercise.com/exercises";

    public static String fetchExerciseData(String exerciseId) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + "/" + exerciseId))
                .header("Authorization", "Bearer YOUR_API_TOKEN")
                .build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            // Check the response status code and handle accordingly
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                // Handle non-200 responses
                return "Error: " + response.statusCode();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
