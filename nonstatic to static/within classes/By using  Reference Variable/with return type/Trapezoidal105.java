class Trapezoidal105
{
 double area()
 {
  int a = 6;
  int b = 7;
  double h = 8.8;
  double ans = ((a+b)*h)/2;
  return ans;
 }
 public static void main(String[] args)
 {
  Trapezoidal105 T1 = new Trapezoidal105();
  double y = T1.area();
  System.out.println(y);
 }
}