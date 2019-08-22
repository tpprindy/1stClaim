package assignmentsMonday19;

import java.util.Scanner;

public class evenOdd {

	public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
       
		int num = reader.nextInt();
       
       
		if(num == 0)
			System.out.println(num + " is neither even nor odd");
		
		else if(num % 2 == 0)
            System.out.println(num + " is even");
		
		else
            System.out.println(num + " is odd");

	}

}
