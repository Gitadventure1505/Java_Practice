class Triangle70
{
 void area(int b, int h)
 {
  int ans = (b*h)/2;
  System.out.println("area of triang ="+ans);
 }
 public static void main(String[] args)
 {
  new Triangle70().area(8,3);
  new Triangle70().area(2,2);
 }
}