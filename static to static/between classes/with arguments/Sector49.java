class Sector49
{
 public static void main(String[] args)
 {
  Operation6.area(8);
  Operation6.area(4);
 }
}
class Operation6
{
 static void area(int r)
 {
  final double theta = 34.142;
  double ans = ((theta*r*r)/2);
  System.out.println("Area of sector ="+ans);
 }

}