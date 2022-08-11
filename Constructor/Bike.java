class Bike
{
 long bik_cost;
 String bik_color;
 String bik_brand;

 Bike(long a, String b, String c)
 {
  bik_cost = a;
  bik_color = b;
  bik_brand = c;
 }
 public static void main(String[] args)
 {
  Bike b1 = new Bike(50000,"black","pulsar");
  System.out.println("bike cost = "+b1.bik_cost);
  System.out.println("bike color ="+b1.bik_color);
  System.out.println("bike brand = "+b1.bik_brand);
 }
}