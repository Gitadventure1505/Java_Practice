class Trapezoidal47
{
 public static void main(String[] args)
 {
  Operation4.area(9.3,3,3);
  Operation4.area(8.4,6,3);
 }
}
class Operation4
{
 static void area(double h, int b, int a)
 {
  double ans = ((a+b)*h)/2;
  System.out.println("area of trap= "+ans);
 }
}