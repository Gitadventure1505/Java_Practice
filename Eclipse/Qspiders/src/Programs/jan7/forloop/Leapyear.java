package Programs.jan7.forloop;

import java.util.Scanner;

public class Leapyear 
{
	public static void main(String[] args)
	{
	int num=2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Year to start");
	int start = sc.nextInt();
   System.out.println("Enter the Year to end");
   int end = sc.nextInt();
		
	int year=start;
	while(year<end)
	{
	
	
 if(year%4==0)
 {
	 if(year%100==0)
	 {
		 if(year%400==0) 
		 {
			num = num+2; 
		 }
		 
	   
	     else
	     {
		 num=num+1;
	     }
	 }	
	 else
	 {
		 num = num+2;
	 }
  }
 else 
 {
	 num = num+1;
 }
 if(num ==3)
 {
	 System.out.println(year+"is Not a leap year");
 }
 else
 {
	 System.out.println(year+ " is Leap year");
 }
  year++;
  num = 2;
	}
	}
}
