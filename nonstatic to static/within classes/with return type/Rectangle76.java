class Rectangle76
{
 int area()
 {
  int b = 6;
  int h = 8;
  int ans = b*h;
  return ans;
 }
 public static void main(String[] args)
 {
  int rec = new Rectangle76().area();
  int rec5 = rec * 5;
  System.out.println("area of rectangle ="+rec5);
 }
}