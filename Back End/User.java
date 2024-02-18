package Planit;


public class User {
    private String userId;
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private String fitnessGoals;
    // Consider using a List or another collection for storing preferences and historical workouts
    // private List<WorkoutPlan> historicalWorkouts;

    public User(String userId, String name, int age, String gender, double weight, double height, String fitnessGoals) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.fitnessGoals = fitnessGoals;
        // this.historicalWorkouts = new ArrayList<>();
    }

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getFitnessGoals() {
		return fitnessGoals;
	}

	public void setFitnessGoals(String fitnessGoals) {
		this.fitnessGoals = fitnessGoals;
	}

    // Include getters and setters here
}





