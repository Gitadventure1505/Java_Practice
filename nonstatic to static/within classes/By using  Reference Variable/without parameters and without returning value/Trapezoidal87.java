class Trapezoidal87
{ 
 void area()
 {
  int a = 7;
  int b = 8;
  int h =6;
  int ans = ((a+b)*h)/2;
  System.out.println(ans);
 }
 public static void main(String[] args)
 {
  Trapezoidal87 T1 = new Trapezoidal87();
  T1.area();
 }
}