package Planit;

public class BMI {
	
    	double weight;
    	double height;
    	
	public static void BMI(double weight, double height) {
    		
        double weightInKg = weight * 0.453592;
        double heightInMeters = height / 100;
        
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        

        System.out.println("Your BMI is: " + String.format("%.2f", bmi));
        
        giveHealthAdvice(bmi);
    }
    
    public static void giveHealthAdvice(double bmi) {
        if (bmi < 18.5) {
            System.out.println("Your BMI is in the lean range. Consultation with a doctor or dietitian is recommended.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Congratulations, your BMI is in the normal range. Continue to maintain a healthy lifestyle!");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Your BMI is in the overweight range. Dietary modifications and increased exercise are recommended.");
        } else {
            System.out.println("Your BMI is in the obese range. Consultation with a doctor or dietitian is highly recommended.");
        }
    }
}
