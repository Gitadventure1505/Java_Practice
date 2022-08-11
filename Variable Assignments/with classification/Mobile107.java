class Mobile107
{
 static String mob_model = "vivo";
 int mob_cost;
 String mob_color;
 public static void main(String[] args)
 {
  Mobile107 M1 = new Mobile107();
  M1.mob_color = "gold";
  M1.mob_cost = 17000;
  System.out.println("price of mobile ="+M1.mob_cost);
  System.out.println("color of mobile = " +M1.mob_color);
  System.out.println("model of mobile = "+mob_model);
 }
}