package assignmentsMonday19;

import java.util.Scanner;

public class compoundInterest {

	public static void main(String[] args) {
		Scanner reader1 = new Scanner(System.in);
		
		System.out.print("Enter the Invested Amount: ");
		int investedAmount = reader1.nextInt();
		
	Scanner reader2 = new Scanner(System.in);
			
		System.out.print("Enter the monthly interest rate: ");
		float interestRate = reader2.nextFloat();

	Scanner reader3 = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int years = reader3.nextInt();
		
		float interestRate1 = interestRate/100;
		
		float rateTime1 = interestRate1/12;
		
		float rateTime2 = rateTime1 + 1;
		
		float parentheses = (float) Math.pow(rateTime2, (12 * years));
		
		float totalYield = investedAmount * parentheses;
		
		System.out.print("Your compound interest is " + totalYield ++);
		

		
		
		reader1.close();
		
		reader2.close();
		
		reader3.close();
		
	

	}

}
