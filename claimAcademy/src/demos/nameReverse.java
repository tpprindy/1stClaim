package demos;

public class nameReverse {

	public static void main(String[] args) 
	
	{

		String name = "Praneeth";
		String reverse = "";
	
		for(int i = name.length() - 1; i >= 0; i--)
			
		{
            reverse = reverse + name.charAt(i);
        }
  
    System.out.println(reverse);
			
    
    /*
     String name = "Praneeth";
		char[] reverse = name.toCharArray();
	
		for(int i = name.length() - 1; i >= 0; i--)
		
  
    System.out.println(reverse[i]);
     */
    
    
    
    
    
		
			
			
			
		/*	
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
		*/

	}

}
