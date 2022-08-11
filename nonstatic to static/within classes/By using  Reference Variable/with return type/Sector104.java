class Sector104
{
 double area()
 {
  final double theta = 87.3;
  int r = 8;
  double ans =  (r*r*theta)/2;
  return ans;
 }
 public static void main(String[] args)
 {
  Sector104 S1 = new Sector104();
  double x = S1.area();
  System.out.println(x);
 }
}