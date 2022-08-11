class Sector84
{
 int y=3;
 void area()
 {
  int r = 9;
  final double theta = 23.8;
  double ans = (theta * r * r)/2;
  System.out.println("area of sector");

 }
  public static void main(String[] args)
  {
   Sector84 S1 = new Sector84();
   S1.area();
   System.out.println(S1.y);
  }
}