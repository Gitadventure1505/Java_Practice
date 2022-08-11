class Circle83
{
 int a = 7;
 public static void main(String[] args)
 {
  Circle83 C1 = new Circle83();
  C1.area();
  System.out.println(C1.a);
 }
 void area()
 {
  int r = 8;
  final double pie = 3.142;
  double result = pie * r * r;
  System.out.println("Area of Circle = "+result);
 }
}