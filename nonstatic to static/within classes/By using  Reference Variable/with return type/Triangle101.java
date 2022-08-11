class Triangle101
{
 int area()
 {
  int b = 9;
  int h = 8;
  int ans =(b*h)/2;
  return ans;
 }
 public static void main(String[] args)
 {
  Triangle101 T1 = new Triangle101();
  int x = T1.area();
  System.out.println(x);
 }
}