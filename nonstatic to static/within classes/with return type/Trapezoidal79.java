class Trapezoidal79
{
 int area()
 {
  int h =  9;
  int a = 5;
  int b = 6;
  int ans = ((a+b)*h)/2;
  return ans;
 }
 public static void main(String[] args)
 {
  int trap = new Trapezoidal79().area();
  int trap5 = trap * 5;
  System.out.println("area of 5 trapezoidal =  "+trap5);
 }
}