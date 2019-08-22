package demos;

public class loopPractice {

	public static void main(String[] args) 
	
	{
		
		
		/*
		//1.Starting point -check initialized value
		//2.Check ending point
		//3.Execute the scope--Displaying
		//4.Go to the direction and increment or decrement accordingly
		//5.Repeat from 2 - If second step fails it stops.
		
		for(int i = 0; i < 9; i=i+2)
		{
		System.out.println("The value is " +i);
		System.out.println("This is all even numbers under 10");
			
		}
		System.out.println("This will show every number");
		for(int i = 0; i <100; i++)
		{
		System.out.println("The value is " +i);
		}
		*/
		
		//Syntax for in array
		
		int[] numbers = {1,2,3,4,5};
		
		int [] numbers1 ;
		numbers1 = new int[] {1,2,3,4,5};
		
		
		int[] intArray = new int[5];
		intArray[0] =10;
		intArray[1] =20;
		intArray[2] =30;
		intArray[3] =40;
		intArray[4] =50;
		
		for(int i =0; i<intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
		

	}

}
