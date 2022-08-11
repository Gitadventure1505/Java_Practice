package Exceptionhandling;

public class upcast 
{
 public static void main(String[] args)
 {
	 System.out.println("main stats");
	 try 
	 {
		int o = 7/0; 
	 }
	 catch(NullPointerException ae)
	 {
		  System.out.println("hgdjs");
		  
	 }
	 catch (Exception e)
	 {
		 System.out.println("caught");
	 }
	 System.out.println("main ends");
 }
}
