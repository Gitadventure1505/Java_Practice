package Programs.jan7.forloop;
import java.util.Scanner;

public class Dynamicinput 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the num");
	 int start = sc.nextInt();
	 System.out.println("enter end num");
	 int end = sc.nextInt();
	 
	 for(int i = start; i<=end; i++)
	 {
		 System.out.println(i);
	 }
 }
}
