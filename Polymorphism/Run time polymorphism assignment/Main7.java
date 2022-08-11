class Bus
{
 void travel()
 {
  System.out.println("1 place another place");
 }
}

class Volvobus extends Bus
{
 void travel()
 {
  System.out.println("No jerk");
 }
}

class Sleeperbus extends Bus
{
 void travel()
 {
  System.out.println("sleep aramsay");
 }
}

class Ksrtc extends Bus
{
  void travel()
 {
  System.out.println("less fare");
  return;
 }
}

 class Shantinagar
 {
  static void terminus(Bus b)
  {
    b.travel();
  }
 }

 class Main7
 {
  public static void main(String[] args)
  {
   Volvobus v = new Volvobus();
   Sleeperbus s = new Sleeperbus();
   Ksrtc k = new Ksrtc();

   Shantinagar.terminus(v);
   Shantinagar.terminus(s);
   Shantinagar.terminus(k);
  }
 }