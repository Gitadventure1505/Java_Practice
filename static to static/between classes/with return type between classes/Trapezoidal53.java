class Trapezoidal53
{
 public static void main(String[] args)
 {
  int trap = Operation3.area();
  int trap5 = trap*5;
  System.out.println("area of 5 trapezoidal =" + trap5);
 }
}
class Operation3
{
 static int area()
 {
  int a = 8;
  int b = 6;
  int h = 7;
  int ans = ((a+b)*h)/2;
  return ans;
 }
}