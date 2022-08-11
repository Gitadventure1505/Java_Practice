package Exceptionhandling;

public class BalException extends Exception
{
	String msg;
	BalException(String msg)
	{
		this.msg = msg;
		
	}
	 public String getMessage()
	 {
		 return msg;
	 }

static void loans() throws BalException
{
	int bal = 5000;
	if(bal>=5000)
	{
		System.out.println("loan approved");
	}
	else
	{
		throw new BalException("insufficient funds");
	}
}
	
public static void main(String[] args)
{
try
 {
     loans();
 }
 catch(BalException e)
 {
	 
	 System.out.println(e.getMessage());
 }
}
}
