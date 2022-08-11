class Circle81
{
public static void main(String[] args)
{
 double cir = new Circle81().area();
 double cir5 = cir*5;
 System.out.println("area of 5 circle ="+cir5);
}
double area()
{
 int r = 7; 
 final double pi = 3.142;
 double ans = pi*r*r;

 return ans;
}
}