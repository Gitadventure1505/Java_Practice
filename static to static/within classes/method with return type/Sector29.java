class Sector29
{
 static double sec()
 {
  int r=16;
  final double theta = 30.4;
  double ans = (theta*r*r)/2;
  return ans;
 }
  public static void main(String[] args)
  {
   double var = sec();
   double sector3= var*3;
   System.out.println("area of 3 sector= "+sector3);
  }
}