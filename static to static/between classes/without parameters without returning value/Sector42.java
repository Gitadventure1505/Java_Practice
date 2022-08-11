class Sector42
{
 public static void main(String[] args)
 {
  System.out.println("start");
  Operation.area();
  System.out.println("end");
 }
}
class Operation
{
 static void area()
 {
  int r=3;
  final double theta=30.142;
  double ans=((theta*r*r)/2);
  System.out.println("area of Sector= " +ans);

 }
}