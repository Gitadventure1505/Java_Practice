class Trapezoidal72
{
 void area(int a,int b, int h)
 {
  int ans = ((a+b)*h)/2;
  System.out.println("area of trap ="+ans);

 }
  public static void main(String[] args)
  {
   new Trapezoidal72().area(5,6,7);
   new Trapezoidal72().area(1,2,3);
  }
}