package assignmentsWed21;

import java.util.Scanner;

public class CaseChangerWithMethods {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);

        System.out.print("Please type a word: ");

        String word = in.nextLine();
        
        String upperCase = word.toUpperCase();
        String lowerCase = word.toLowerCase();
        char [] upCase = upperCase.toCharArray();
        char [] loCase = lowerCase.toCharArray();
       
        Changer(word, upCase, loCase);
        
    }
	public static String Changer (String word, char []upCase, char[] loCase)
    {

    for (int i = 0; i < word.length(); i++) {

        if (i % 2 == 0) {          
        System.out.print(loCase[i]);} 
        
        else {
        System.out.print(upCase[i]);}
        
       
    }
    return word;

    }
}
