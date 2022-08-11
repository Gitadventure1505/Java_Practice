class Sector77
{
 public static void main(String[] args)
 {
  double sec = new Sector77().area();
  double sec5 = sec * 5 ;
  System.out.println("area of 5 sector =" +sec5);
 }
 double area()
 {
  int r =6;
  double theta = 5.77;
  double ans = (theta * r* r)/2;
  return ans;
 }
}