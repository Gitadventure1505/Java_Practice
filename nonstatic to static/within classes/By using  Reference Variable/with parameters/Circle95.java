class Circle95
{
 void area(int r)
 { 
  final double pi = 3.142;
  double ans = pi * r * r;
  System.out.println(ans);

 }
  public static void main(String[] args)
  {
   Circle95 C1 = new Circle95();
   C1.area(8);
  }
}