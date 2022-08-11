class Prime
{
 public static void main(String[] args)
 {
 int num = 1;
 while(num<=100)
	 {
 int max=2;
  for(int i=2; i<num; i++)
  {
   if(num%i==0)
   {
     max++;
     break;
   }
  }
  if(max==3)
 System.out.println("it is not prime"+num);
 else {
  System.out.println("it is prime"+num);
 }
 num++;
	 }
 }
}