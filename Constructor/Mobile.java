class Mobile
{
 int Mob_cost;
 String Mob_model;
 String Mob_color;
 Mobile(int a, String b, String c)
 {
  Mob_cost =a;
  Mob_model = b;
  Mob_color =c;
 }
  public static void main(String[] args)
 {
  Mobile mbl1 = new Mobile(20000, "Vivo","gold");
  System.out.println("Mobile price = "+mbl1.Mob_cost);
  System.out.println("Mobile model ="+mbl1.Mob_model);
  System.out.println("Mobile color ="+mbl1.Mob_color);
  Mobile mbl2 = new Mobile(30000, "Oppo", "Black");
   System.out.println("Mobile price = "+mbl2.Mob_cost);
  System.out.println("Mobile model ="+mbl2.Mob_model);
  System.out.println("Mobile color ="+mbl2.Mob_color);

 }
}