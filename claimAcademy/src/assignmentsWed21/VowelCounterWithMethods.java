package assignmentsWed21;

import java.util.Scanner;

public class VowelCounterWithMethods {

	public static void main(String[] args) 
	
	{
		// 3. Write a program to count all the vowels in a string.
		// E.g Input: banana
		// Output:3

		int count = 0;

		System.out.println("Enter a word to find out how many vowels it contains: ");

		Scanner in = new Scanner(System.in);

		String word = in.next();
		Vowel(count, word);
	}
	
	public static String Vowel(int count, String word) {
		
	
	{

		for (int i=0; i<word.length(); i++){
		         char ch = word.charAt(i);
		         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
		         {
		            count++;
		         }
		      }
		      System.out.println("Number of vowels in the given word is: "+count);

		}
	return word;
	}
}

		