class Parallelogram80
{
 int area()
 {
  int b=6;
  int h = 9;
  int ans = b*h;
  return ans;

 }
 public static void main(String[] args)
 {
  int par = new Parallelogram80().area();
  int par5 = par*5;
  System.out.println("area of 5 parallelogram =" +par5);
 }
}