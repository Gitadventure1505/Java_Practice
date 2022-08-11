class Ellipse74
{
 void area(int a, int b)
 {
  final double pi = 3.142;
  double ans = pi * a * b;
  System.out.println("area of elli ="+ ans);
 }
 public static void main(String[] args)
 {
  new Ellipse74().area(6,8);
  new Ellipse74().area(5,8);
 }
}