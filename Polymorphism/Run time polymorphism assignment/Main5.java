class Mobiles
{
 void type()
 {
  System.out.println("Android");
 }
}

class Sony extends Mobiles
{
 void type()
 {
  System.out.println("Good design");
 }
}

class Iphone extends Mobiles
{
 void type()
 { 
  System.out.println("Brand speaks");
 }
}
class Samsung extends Mobiles
{
 void type()
 {
  System.out.println("Kachada");
   }

}
 class Main5
 {
  public static void main(String[] args)
  {
   Sony s = new Sony();
   Iphone i = new Iphone();
   Samsung s1 = new Samsung();

   Mobileshop.category(s);
   Mobileshop.category(i);
   Mobileshop.category(s1);


  }
 }
 class Mobileshop
 {
  static void category(Mobiles m)
  {
   m.type();
  }
 }