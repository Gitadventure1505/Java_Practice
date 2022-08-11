class Rectangle100
{
 int area()
 {
  int b=3;
  int h = 8;
  int ans = b*h;
  return ans;
 }
 public static void main(String[] args)
 {
  Rectangle100 R1 = new Rectangle100();
  int x = R1.area();
  System.out.println(x);
 }
}