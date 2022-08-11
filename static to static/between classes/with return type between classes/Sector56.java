class Sector56
{
 public static void main(String[] args)
 {
  double sec = Operation6.area();
  double sec6 = sec*6;
  System.out.println("area of 5 sector ="+sec6);
 }
}
class Operation6
{
 static double area()
 {
  double theta=86.3;
  int r = 9;
  double ans = (theta*r*r)/2;
  return ans;
 }
}