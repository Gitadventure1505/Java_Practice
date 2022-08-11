class Trapezoidal28
{
 static int demo()
 {
  int a=2;
  int b=3;
  int h=4;
  int result = (a+b)*h;
  return result;
 }
  public static void main(String[] args)
  {
   int pro = demo();
   int ans = pro/2;
   System.out.println(ans);
  }
}