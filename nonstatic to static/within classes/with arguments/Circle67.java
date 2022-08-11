class Circle67
{
void area(int r)
{
 final double pie = 3.142;
 double ans = pie*r*r;
 System.out.println("area of circle ="+ans);
}
 public static void main(String[] args)
 {
  new Circle67().area(7);
  new Circle67().area(6);
 }
}