class Ellipse50
{
 public static void main(String[] args)
 {
  Operation8.area(2,2);
  Operation8.area(7,3);

 }
}
class Operation8
{
 static void area(int a, int b)
 {
  final double pie = 3.142;
  double ans = pie*a*b;
  System.out.println("Area of elli ="+ans);
 }
}