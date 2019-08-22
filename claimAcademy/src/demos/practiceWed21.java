package demos;

import java.util.Scanner;

public class practiceWed21 {
	
	public static void main(String[] args)
	
	{

		Scanner in = new Scanner(System.in);
		
		System.out.println("Input Word:");
		
		String input = in.nextLine();
		
		System.out.println("Input letter to remove:");
		
		String letterToRemove = in.nextLine();
		
		String newString = input.replace(letterToRemove, "");
		{
			System.out.println(newString);
		}
	}
}
