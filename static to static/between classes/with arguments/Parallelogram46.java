class Parallelogram46
{
 public static void main(String[] args)
 {
  Operation3.area(8,3);
  Operation3.area(7,4);
 }
}
class Operation3
{
 static void area(int b, int h)
 {
  int ans = (b*h)/2;
  System.out.println("area of parallel ="+ans);
 }
}