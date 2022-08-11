package Exceptionhandling;

public class Nullpoint 
{

 public static void main(String[] args)
 {
	 Nullpoint n = null;
	 System.out.println("main starts");
	 try
	 {
		 System.out.println(n.hashCode());
	 }
	 catch(NullPointerException ae)
	 {
		System.out.println("caught"); 
	 }
	 System.out.println("main ends");
 }
}
