class Rectangle37
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
  int b=9;
  int h = 10;
  int ans=b*h;
  System.out.println("Area of rect =" +ans);
 }
}