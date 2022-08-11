class Sector63
{
 int a =3;
 void area()
 {
  int r=2;
  final double theta =68.3;
  double ans = (theta*r*r)/2;
  System.out.println("Area of sector ="+ ans);
 }
 public static void main(String[] args)
 {
  System.out.println(new Sector63().a);
  new Sector63().area();
 }
}