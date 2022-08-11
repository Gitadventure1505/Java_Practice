class Television110
{
 static String tv_brand = "LG";
 int tv_cost;
 String tv_type;
 public static void main(String[] args)
 {
  Television110 t1 = new Television110();
  t1.tv_cost = 30000;
  t1.tv_type = "led_32inch";
  System.out.println("television brand = " +tv_brand);
  System.out.println("television cost = "  +t1.tv_cost);
  System.out.println("television type = " + t1.tv_type);
 }
}