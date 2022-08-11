package Exceptionhandling;

public class Nested 
{
  public static void main(String[] args)
  {
	  Nested n = null;
	  try 
	  {
		  int i = 1/0; 
		try
		{
			System.out.println(n.hashCode());
		}
		catch(NullPointerException j)
		{
			System.out.println("caught");
		}
	  }
	  catch(ArithmeticException a)
	  {
		  System.out.println("handled");
	  }
  }
 
}
