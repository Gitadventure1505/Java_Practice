class Sector96
{
 void area(int r)
 {
  final double theta = 67.8;
  double ans = (r*r*theta)/2;
  System.out.println(ans);

 }
 public static void main(String[] args)
 {
  Sector96 S1=new Sector96();
  S1.area(7);
 }
}