import Exceptionhandling.Nullpoint;

public class Sample 
{
	 public static void main(String[] args)
	 {
		 Sample n = new Sample();
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
