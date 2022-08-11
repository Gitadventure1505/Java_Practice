class Triangle30
{
 static int tria()
 {
  int b = 7;
  int h = 2;
  int ans = (b*h)/2;
  return ans;
 }
 public static void main(String[] args)
 {
  int tri = tria();
  int triangle5=tri*5;
  System.out.println("area of 5 triangle=" +triangle5);
 }
}