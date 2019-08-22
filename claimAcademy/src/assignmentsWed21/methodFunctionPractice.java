package assignmentsWed21;

public class methodFunctionPractice {

	public static void main(String[] args) 
	{
		methodFunctionPractice p1 = new methodFunctionPractice(); //Gives permission to next method to use info
		
		p1.Add(10.3, 13.89);
		p1.Add(234.3, 156763.89);
		int result =Sub(19,34);
		System.out.println(result);
		System.out.println(Sub(450, 200));
		

	}
	public void Add(double a , double b)
	{
		double c = a + b;
		System.out.println(c);
		
		
	}
	
	public static int Sub(int a , int b)
	{
	
	int c = a - b;
	System.out.println(c);
	return c;
	
	}
}
