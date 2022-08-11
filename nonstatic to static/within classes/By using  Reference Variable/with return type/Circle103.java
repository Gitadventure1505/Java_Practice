class Circle103
{
 double area()
 {
  final double pi = 3.142;
  int r = 8;
  double ans = pi * r* r;
  return ans;

 }
  public static void main(String[] args)
  {
   Circle103  C1 = new Circle103();
   double x = C1.area();
   System.out.println(x);
  }
}