class Ellipse41
{
 public static void main(String[] args)
 {
 System.out.println("start");
 Operation.area();
 System.out.println("end");
 }
}
class Operation
{
 static void area()
 {
  int a=2;
  int b=3;
  final double pie=3.142;
  double ans= pie*a*b;
  System.out.println("area of ellipse="+ans);
 }
}