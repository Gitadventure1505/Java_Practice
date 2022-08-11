package Exceptionhandling;

public class Arithmetic 
{
  public static void main(String[] args)
  {
	  System.out.println("-----mainstarts-------");
	  try
	  {
		  int f = 8/0;
	  }
	  catch (ArithmeticException ae)
	  {
		  System.out.println("caught");
	  }
	  System.out.println("-----main ends------");
  }
}
