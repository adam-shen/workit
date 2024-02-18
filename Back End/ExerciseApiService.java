package Planit;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ExerciseApiService {
    private final HttpClient httpClient = HttpClient.newBuilder().build();

    public Exercise getExerciseDetails(String exerciseId) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api-ninjas.com/api/exercises" + exerciseId))
                .header("Authorization", "DRH/tK9oyh/1b39K3BdZGQ==kGBodqDQ3tymPzsA") // Replace with actual authentication method
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            // Parse JSON response and create Exercise object
            return parseExerciseJson(response.body());
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Implement better error handling
        }
    }

    // Implement JSON parsing method
    private Exercise parseExerciseJson(String json) {
        // Parse JSON and create Exercise object
        return new Exercise(/* Parameters from JSON */);
    }
}
