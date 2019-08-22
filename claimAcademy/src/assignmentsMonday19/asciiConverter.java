package assignmentsMonday19;

import java.util.Scanner;

public class asciiConverter {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a Character: ");
		
		char symbol = in.next().charAt(0);
		
		int asciiValue = (int) symbol;
		
		System.out.println("The value of the letter you chose is " + asciiValue ++);
		
		in.close();

		
		
		

	}


		
	}


		



