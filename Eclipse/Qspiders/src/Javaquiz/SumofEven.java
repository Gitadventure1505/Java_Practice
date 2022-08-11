package Javaquiz;

public class SumofEven 
{
 public static void main(String[] args)
 {
	 int sum = 0;
	 for(int i = 2; i<70; i++  )
	 {
		 if(i%2==0)
		 System.out.print(i+" ");
		 sum = i+sum;
		 }
	 System.out.println();
	 
	 System.out.println(sum);

 } 
}
