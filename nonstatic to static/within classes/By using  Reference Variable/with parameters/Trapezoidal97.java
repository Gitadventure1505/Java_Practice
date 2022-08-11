class Trapezoidal97
{
 void area(int a, int b, int h)
 {
  int ans = ((a+b)*h)/2;
  System.out.println(ans);
 }
 public static void main(String[] args)
 {
  Trapezoidal97 T1 = new Trapezoidal97();
  T1.area(2,3,4);
 }
}