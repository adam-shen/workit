package Planit;

public class ExerciseLog {
    private String logId;
    private String sessionId; // Consider using WorkoutSession type for direct association
    private String exerciseId; // Consider using Exercise type for direct association
    private int duration;
    private int repetitions;
    private int sets;
    private String notes;

    public ExerciseLog(String logId, String sessionId, String exerciseId, int duration, int repetitions, int sets, String notes) {
        this.logId = logId;
        this.sessionId = sessionId;
        this.exerciseId = exerciseId;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;
        this.notes = notes;
    }

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getExerciseId() {
		return exerciseId;
	}

	public void setExerciseId(String exerciseId) {
		this.exerciseId = exerciseId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

    // Include getters and setters here
}