class Triangle64
{
 int q=3;
 void area()
 {
  int b=3;
  int h=4;
  int ans = (b*h)/2;
  System.out.println("Area of triangle ="+ans);
 }
 public static void main(String[] args)
 {
  System.out.println(new Triangle64().q);
  new Triangle64().area();
 }
}