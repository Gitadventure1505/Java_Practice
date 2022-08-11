class Circle48
{
 public static void main(String[] args)
 {
  Operation5.area(9);
  Operation5.area(6);

 }
}
class Operation5
{
 static void area(int r)
 {
  final double pie=3.142;
  double ans = pie* r *r;
  System.out.println("area of circle = "+ans);
 }
}