package Javaquiz;

import java.util.Scanner;

public class SumofPrime 
{
 public static void main(String[] args)
 {
	 int sum = 0;
	 for (int num = 2; num < 10; num++ )
	 {
	 boolean prime = true;
	
	 for(int i=2; i<num; i++)
	{
	 if(num%i==0)
	 {
		 prime = false;
	 }
	}
	 if(prime==true)
	 {
		 System.out.println(num+"  is prime number");
		 sum = sum+num;
	 }
	 else
	 {
		 System.out.println(num+"  is not prime number");
	 }
  }
	 System.out.println(sum);
 }
}
