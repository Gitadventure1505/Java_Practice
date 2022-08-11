package janthirty;

public class Till 
{
 public static void main(String[] args)
 {
	 int fact = 1;
	 int num = 138888979;
	 int sum = 0;
	 while(num!=0)
	 {
		 int rem = num%10;
		 if(rem%2==1)
		 {
		  sum = sum+rem;	 
		 }
		 num = num/10;
	 }
	 if(sum<10)
	 {
		 for(int i = 1; i<=sum; i++)
		fact = fact*i;
		 System.out.println(fact);
	 }
	 else
	 {
		int numb = sum;
		int sumb=0;
		while(numb!= 0 )
		{
			int rem = numb%10;
			sumb = sumb+rem;
			numb = numb/10;
			
		}
		for(int i = 1; i<=sumb; i++)
			fact = fact*i;
			 System.out.println(fact);
	 }
 }
}
