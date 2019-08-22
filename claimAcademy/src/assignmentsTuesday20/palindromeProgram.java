package assignmentsTuesday20;

import java.util.Scanner;

public class palindromeProgram {

	public static void main(String[] args) 
	
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word:");
		
		String word = in.next();
		
		String loCase = word.toLowerCase();
		
		String reverse = "";
		
			for(int i = loCase.length() - 1; i >= 0; i--)
			{
	            reverse = reverse + loCase.charAt(i);
	        }
				if (loCase.equals(reverse))
		{
			System.out.println("The word you chose is a palindrome.");
		}
		
		else  
			System.out.println("The word you chose is not a palindrome.");
		
	  
	in.close();
	
	}
}
