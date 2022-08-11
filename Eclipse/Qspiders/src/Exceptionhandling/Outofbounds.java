package Exceptionhandling;

public class Outofbounds 
{
 public static void main(String[] args)
 {
	 int[] box = {6};
	 System.out.println("main starts");
	 try
	 {
		 System.out.println(box[3]);
	 }
	 catch(ArrayIndexOutOfBoundsException ae)
	 {
		 System.out.println("caught");
		 
	 }
	 System.out.println("Mainends");
 }
}
