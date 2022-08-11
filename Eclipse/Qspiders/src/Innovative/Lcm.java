package Innovative;
import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2st number");
        int num2 = sc.nextInt();
        int Lcm=0;
         
        if(num1>num2)
        {
        	num1 = num1+num2;// 1+3 =4
        	num2 = num1-num2;//4-3 = 1 
        	num1 = num1-num2;//4-1 =3 
        }
        for (int i = 1;  ; i++) 
        {
		  int mult = num2*i;
		  if(mult%num1==0)
		  {
			Lcm = mult;
			break;
		  }
		}
        System.out.println("Lcm is "+ Lcm);
        
	}

}
