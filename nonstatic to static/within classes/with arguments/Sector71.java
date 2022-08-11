class Sector71
{
 void area(int r)
 {
  double theta = 33.4;
  double ans = (r*r*theta)/2;
  System.out.println("area of sector ="+ans);
 }
  public static void main(String[] args)
  {
   new Sector71().area(8);
   new Sector71().area(5);
  }
}