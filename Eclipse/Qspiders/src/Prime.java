
public  abstract class Prime

{
 public static void main(String[] args) 
 
 {
	boolean prime = false;
	int no = 14;
	for(int i=2; i<=7; i++)
	{
		if(no%i==0)
		{
		  prime  = true;
		  break;
		}

	}
	if(prime == false)
	{
		System.out.println("the number is prime ");
	}
	else
	{
		System.out.println("the number is not prime ");
		}
}}
