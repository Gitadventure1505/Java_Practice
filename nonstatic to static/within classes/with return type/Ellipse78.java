class Ellipse78
{
 public static void main(String[] args)
 {
  double elli = new Ellipse78().area();
  double elli5 = elli * 5;
  System.out.println("area of 5 ellipse = "+elli5);
 }
 double area()
 {
  int a = 7;
  int b = 8;
  final double pi = 3.142;
  double ans = pi*a*b;
  return ans;
 }
}