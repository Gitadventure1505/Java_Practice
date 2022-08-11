class Parallelogram54
{
 public static void main(String[] args)
 {
  int para = Operation4.area();
  int para4 = para*4;
  System.out.println("area of parallelogram = "+para4);
 }
}
class Operation4
{
 static int area()
 {
  int b=2;
  int h=6;
  int ans=b*h;
  return ans;
 }
}