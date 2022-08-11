class Circle40
{
 public static void main(String[] args)
 {
 int r=2;
 final double pie = 3.142;
 double ans = (pie*r*r);
 Operation.area();
 System.out.println("area of circle=" +ans);
 }
}
class Operation
{
 static void area()
 {
  System.out.println("start");
 }
}

