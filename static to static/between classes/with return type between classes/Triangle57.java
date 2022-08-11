class Triangle57
{
 public static void main(String[] args)
 {
  int tri = Operation7.area();
  int tri5 = tri*5;
  System.out.println("area of 5 triangle = "+tri5);

 }
}
class Operation7
{
 static int area()
 {
  int b=3;
  int h =4;
  int ans = (b*h)/2;
  return ans;
 }
}