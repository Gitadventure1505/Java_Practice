class Trapezoidal62
{
int h=3;
void area()
{
 int a=2;
 int b=6;
 int h=6;
 int ans = ((a+b)*h)/2;
 System.out.println("area of trapezoidal = "+ans);

}
public static void main(String[] args)
{
 System.out.println(new Trapezoidal62().h);
 new Trapezoidal62().area();
}
}