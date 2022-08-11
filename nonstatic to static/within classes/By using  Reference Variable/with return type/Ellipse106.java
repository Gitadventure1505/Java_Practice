class Ellipse106
{
 double area()
 {
  int a = 7;
  int b = 9;
  final double pi = 3.142;
  double ans = pi*a*b;
  return ans;
 }
 public static void main(String[] args)
 {
 
  Ellipse106 E1 = new Ellipse106();
  double g = E1.area();
  System.out.println(g);
 }

}