package Javaquiz;
import java.util.Scanner;

public class Mypower 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int ans = 1;
	 System.out.println("Enter base");
	 int base = sc.nextInt();
	 System.out.println("Enter power");
	 int power = sc.nextInt();
	 
	 for(int i = 1; i <=power; i++)
	 {
        ans = ans*base;
	 }
	 System.out.println(ans);
	
	 
 }
}
