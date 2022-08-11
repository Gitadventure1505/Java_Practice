package janthirty;

public class SumofSquares 
{
 public static void main(String[] args)
 {
	 int num = 7652;
	 int sum = 0;
	 int rem;
	 while(num!=0)
	 {
		 rem = num%10;
		 sum = sum + rem*rem;
		 num = num/10;
	 }
	 System.out.println(sum);
 }
}

