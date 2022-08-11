class Trapezoidal39
{
 public static void main(String[] args)
 {
  System.out.println("start");
  Operation.area();
  System.out.println("ends");
 }
}
class Operation
{
 static void area()
 {
  int a=2;
  int b=3;
  int h=5;
  int ans=((a+b)*h)/2;
  System.out.println("area of trapez ="+ans);
 }
}