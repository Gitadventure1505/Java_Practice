class Ellipse66
{
 int t=7;
 void area()
 {
  int a=2;
  int b=3;
  final double pi=3.142;
  double ans = pi*a*b;
  System.out.println("Area of ellipse = "+ans);
 }
 public static void main(String[] args)
 {
  new Ellipse66().area();
  System.out.println(new Ellipse66().t);
 }
}