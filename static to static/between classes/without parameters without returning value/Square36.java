class Square36
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
  int a = 2;
  int ans = a*a;
  System.out.println("area of square ="+ans);
 }

}