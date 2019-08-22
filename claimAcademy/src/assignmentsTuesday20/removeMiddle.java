package assignmentsTuesday20;

import java.util.Scanner;

public class removeMiddle {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word:");

		String str = in.next();
		int l = str.length();
	        

	        if((l % 2) == 0 ) 
	        {
	        	StringBuffer sb =new StringBuffer(str);
	        	
	        	System.out.println(sb.deleteCharAt(l/2).toString());
	        	System.out.println(sb.deleteCharAt((l/2)-1).toString());
	        } 
	        else {
	        	StringBuffer sb =new StringBuffer(str);
	        	
	        	System.out.println(sb.deleteCharAt((l-1)/2).toString());
	        }

	        
	}
}

	
