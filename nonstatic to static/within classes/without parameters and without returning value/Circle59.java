class Circle59
{
 int a=6;
 void area()
 {
  int r=7;
  final double pi = 3.142;
  double result = pi*r*r;
  System.out.println("area of circle = "+result);
 }
  public static void main(String[] args)
  {
   new Circle59().area();
   System.out.println(new Circle59().a);
  }
}