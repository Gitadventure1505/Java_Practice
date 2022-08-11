package janthirty;

public class TagName 
{
 public static void main(String[] args)
 {
	 int number = 24;
	 boolean b = true;
	 for (int i =2; i<number; i++)
	 {
	  if(number%i==0)
	  {
		  b = false;
		  break;
	  }
	 }
	 if(b == true)
	 {
		 System.out.println("prime");
	 }
	 else System.out.println("not prime");
	 
 }
 }
