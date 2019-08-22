package assignmentsMonday19;

import java.util.Scanner;

public class bmiCalculator {

	public static void main(String[] args) {
		
		System.out.println("Please use the metric system. ");
		
	Scanner reader1 = new Scanner(System.in);
		
		System.out.print("Enter your height in centimeters: ");
		int height = reader1.nextInt();
		
	Scanner reader2 = new Scanner(System.in);
			
		System.out.print("Enter your weight in kilograms: ");
		int weight = reader2.nextInt();
		
		double height2 = height * height;
		
		double bmi = weight/height2;
		
		double bmi2 = bmi*10000;
		
		System.out.println("Your BMI is " + bmi2 ++);
		
		reader1.close();
		reader2.close();

	}

}
