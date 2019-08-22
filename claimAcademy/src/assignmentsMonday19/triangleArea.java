package assignmentsMonday19;

import java.util.Scanner;

public class triangleArea {

	public static void main(String[] args) {
		Scanner reader1 = new Scanner(System.in);
		
			System.out.print("Enter the height: ");
			int height = reader1.nextInt();
			
		Scanner reader2 = new Scanner(System.in);
				
			System.out.print("Enter the base: ");
			int base = reader2.nextInt();

			int area = (base * height)/2;
			System.out.println("The area of the triangle is " + area ++);
			
			
			
	}

}
