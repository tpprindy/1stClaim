package assignmentsMonday19;

import java.util.Scanner;

public class roundNumbers {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
			System.out.print("Enter the number: ");
			double numA = reader.nextDouble();
			
			int numB = (int) numA;
			
			double numC = numA - numB;
			
			int numD = numB + 1;
			
			if (numC >= .5)
			{
				System.out.println(numD);
					
			}
			if (numC < .5)
			{
				
			System.out.println(numB);
			
			}
			
			reader.close();
		


	}

}
