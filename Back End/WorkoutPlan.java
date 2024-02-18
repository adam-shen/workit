package Planit;

public class WorkoutPlan {
    private String planId;
    private String userId; // Consider using User type instead for direct association
    private String startDate;
    private String endDate;
    private String goals;
    private String status;
    // private List<WorkoutSession> sessions;

    public WorkoutPlan(String planId, String userId, String startDate, String endDate, String goals) {
        this.planId = planId;
        this.userId = userId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.goals = goals;
        this.status = "Active";
        // this.sessions = new ArrayList<>();
    }

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    // Include getters and setters here
}

