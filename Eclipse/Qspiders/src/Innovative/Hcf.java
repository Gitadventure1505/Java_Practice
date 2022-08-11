package Innovative;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2st number");
        int num2 = sc.nextInt();
        int rem=1;
        
        if(num1>num2)
        {
        	num1 = num1+num2;
        	num2 = num1-num2;
        	num1 = num1-num2;
        }
        while(rem!=0)
        {
        	rem=num2%num1;
        	num2 = num1;
        	num1 = rem;
       	}
     System.out.println("hcf is "+num2);
	}

}
