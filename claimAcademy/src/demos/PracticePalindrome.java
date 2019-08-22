package demos;

public class PracticePalindrome {

	public static void main(String[] args) {
		
		String a = "Praneeth";
		
		char[] b = a.toCharArray();
		for (int i=a.length()-1; i>0; i++)
		{
			System.out.println(b[i]);
		}
		
		if(a.equals(b))
		{
			System.out.println("This is a palindrome.");
		}
		else
		{
			System.out.println("This is not a palindrome");
		}
			
	}

}
