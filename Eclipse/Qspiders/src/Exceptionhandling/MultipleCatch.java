package Exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println("start");
try
    {
	int a = 10/0;
	}

catch(ArithmeticException e)
{
System.out.println("handled");
}
catch(Exception e)
{
System.out.println("caught");
}




	}
}
