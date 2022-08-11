class Electricdevice
{
 void current()
 {
  System.out.println("external energy");
 }
}

class Fan extends Electricdevice
{
 void current()
 {
  System.out.println("blow air");
 }
}

class Fridge extends Electricdevice
{
 void current()
 { 
  System.out.println("Preserve items");


 }
}



class Ac extends Electricdevice
{
 void current()
 {
  System.out.println("cools room");
 }
}

class Home
{
 static void plugboard(Electricdevice e)
 {
  e.current();
 }
}

class Main9
{
 public static void main(String[] args)
 {
  Fan f = new Fan();
  Ac a = new Ac();
  Fridge fr = new Fridge();
  

  Home.plugboard(f);
  Home.plugboard(a);
  Home.plugboard(fr);
  }

}