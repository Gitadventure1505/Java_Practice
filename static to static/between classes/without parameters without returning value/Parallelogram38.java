class Parallelogram38
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
  int b=2;
  int h=3;
  int ans= (b*h)/2;
  System.out.println("area of parallel ="+ans);
 }
}