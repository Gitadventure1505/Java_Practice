package Exceptionhandling;

public class Twocatch 
{
	 public static void main(String[] args)
	 {
		 Nullpoint n = null;
		 System.out.println("main starts");
		 try
		 {
			 System.out.println(n.hashCode());
		 }
		 catch(ArrayIndexOutOfBoundsException a)
		 {
			 System.out.println("jgj");
		 }
		 catch(NullPointerException ae)
		 {
			System.out.println("caught"); 
		 }
		 System.out.println("main ends");
	 }

}
