package Planit;

public class WorkoutSession {
    private String sessionId;
    private String planId; // Consider using WorkoutPlan type for direct association
    private String date;
    private String notes;
    private String status;
    // private List<ExerciseLog> exercises;

    public WorkoutSession(String sessionId, String planId, String date) {
        this.sessionId = sessionId;
        this.planId = planId;
        this.date = date;
        this.notes = "";
        this.status = "Planned";
        // this.exercises = new ArrayList<>();
    }

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    // Include getters and setters here
}
