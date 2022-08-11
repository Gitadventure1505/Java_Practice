package Innovative;

import java.util.Scanner;
import java.util.Vector;

public class Factor 
{
 public static void main(String[] args)
 {
	
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int number = sc.nextInt();
	 boolean b = true;
	 for (int i =2; i<number; i++)
	 {
	  if(number%i==0)
	  {
		  b = false;
		  break;
	  }
	 }//loopA for check prime
	 
	 if(b == true)
	 {
		 System.out.println("factors are [ 1 and "+number+"]");
	 }
	 else
	 {
		
		   int start = 2; 
		   int end = number;  
		   Vector v1 = new Vector();
		   for(int num = start; num<=end; num++)
		   {
		   boolean change = false;
		   for(int i = 2;  i<num; i++)
		   {
			   if(num%i==0)
			   {
				   change  = true;
				   break;
			   }
			      
		   }//loop for check prime
		 if(change==false)
		 {
			   v1.add(num);
		 }
		   }//loop for addding prime
		   Vector v2 = new Vector();
		   while(number!=1)
		   {
			   for(int a = 0; a<(int)v1.size(); a++)
			   {
				   if(number%(int)v1.get(a)==0)
				   {
			     number = number/(int)v1.get(a);
			     v2.add(v1.get(a));
				   }
			   }
		   }   
		   System.out.println("Factors are"+v2);
	 }
 }
}
