class Bike111
{
 static String b_brand = "yamaha";
 long b_cost;
 String b_color;
 public static void main(String[] args)
 {
 Bike111 b1 = new Bike111();
 b1.b_cost = 50000;
 b1.b_color = "black";
 System.out.println("bike brand = "+ b_brand);
 System.out.println("bike cost = "+ b1.b_cost);
 System.out.println("bike color = "+b1.b_color);
 }
}