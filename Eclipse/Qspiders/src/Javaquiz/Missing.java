package Javaquiz;

import java.util.Scanner;

public class Missing {

	public static void main(String[] args) 
	{
	 
	 int[] arr = {1,2,3,4,6};
	 int Actual = 0;
	 
	 for (int i = 0; i < arr.length; i++) 
	 {
	     Actual = Actual+arr[i];
	     
	 }
	 int n = arr[arr.length-1];
	 int Expected = (n*(n+1))/2;
	 
	 int missed = Expected-Actual;
	 System.out.println("The missed Number is "+missed );
	 
	 
	 
	 

	}

}
