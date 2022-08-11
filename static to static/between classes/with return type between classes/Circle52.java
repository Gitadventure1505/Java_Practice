class Circle52
{
 public static void main(String[] args)
 {
  double circ = Operation2.area();
  double circ5 = circ*5;
  System.out.println("area of circle= "+circ5);
 }
}
class Operation2
{
  static double area()
 {
  final double pi = 3.142;
  int r = 7;
  double result = pi*r*r;
  return result;
 }
}