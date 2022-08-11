class Rectangle32
{
 static int rect()
 {
  int w= 2;
  int h=5;
  int ans = w*h;
  return ans;
 }
 public static void main(String[] args)
 {
  int Area= rect();
  int area5 = Area*5;
  System.out.println("Area of 5 circle= "+area5);
 }
}