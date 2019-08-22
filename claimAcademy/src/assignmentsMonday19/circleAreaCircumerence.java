package assignmentsMonday19;

import java.util.Scanner;

public class circleAreaCircumerence {

	public static void main(String[] args) {
		
Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
			int radius = reader.nextInt();
			
			double area = 3.141592 * (radius * radius);
			
			double circu = (2 * 3.141592 * radius);
			
			System.out.println("A circle with a radius of " + radius + " has an Area of " + area + " and a Circumference of " + circu ++);
			

		
		
	}

}
