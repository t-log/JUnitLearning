package org.example;

public class BMI {
    public static String calculateBMI(double w , double h){
        double bmi = w/(h*h);
        if(bmi < 18.5){
            return "under weight";
        }
        else if(bmi <25){
            return "normal weight";
        }
        else {
            return "over weight";
        }
    }

}
