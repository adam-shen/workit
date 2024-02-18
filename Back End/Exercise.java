package Planit;

public class Exercise {
    private String exerciseId;
    private String name;
    private String description;
    private String exerciseType;
    private int recommendedDuration;
    private int recommendedRepetitions;
    private int recommendedSets;

    public Exercise(String exerciseId, String name, String description, String exerciseType, int recommendedDuration, int recommendedRepetitions, int recommendedSets) {
        this.exerciseId = exerciseId;
        this.name = name;
        this.description = description;
        this.exerciseType = exerciseType;
        this.recommendedDuration = recommendedDuration;
        this.recommendedRepetitions = recommendedRepetitions;
        this.recommendedSets = recommendedSets;
    }

	public String getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(String exerciseId) {
		this.exerciseId = exerciseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExerciseType() {
		return exerciseType;
	}

	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
	}

	public int getRecommendedDuration() {
		return recommendedDuration;
	}

	public void setRecommendedDuration(int recommendedDuration) {
		this.recommendedDuration = recommendedDuration;
	}

	public int getRecommendedRepetitions() {
		return recommendedRepetitions;
	}

	public void setRecommendedRepetitions(int recommendedRepetitions) {
		this.recommendedRepetitions = recommendedRepetitions;
	}

	public int getRecommendedSets() {
		return recommendedSets;
	}

	public void setRecommendedSets(int recommendedSets) {
		this.recommendedSets = recommendedSets;
	}

    // Include getters and setters here
}
