class Ellipse58
{
 public static void main(String[] args)
 {
  double elli = Operation8.area();
  double elli3 = elli * 3;
  System.out.println("Area of 3 ellipse = "+elli3);
 }
}
class Operation8
{
 static double area()
 {
  final double pi = 3.142;
  int a = 7;
  int b = 8;
  double ans = pi*a*b;
  return ans;
 }
}