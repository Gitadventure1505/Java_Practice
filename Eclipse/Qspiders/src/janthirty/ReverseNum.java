package janthirty;

public class ReverseNum 
{
 public static void main(String[] args)
 {
	 int sum = 0;
	 int num = 6739;
	 int rem;
	 while(num!=0)
	 {
		 rem = num%10;
		 sum = sum*10+rem;
		 num = num/10;
		 
	 }
	 System.out.println(sum);

	 
 }
 
}
