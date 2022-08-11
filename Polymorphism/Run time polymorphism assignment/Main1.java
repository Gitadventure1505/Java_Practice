class Fruits
{
 void price()
 {
  System.out.println("Price of 1kg");
 }
}

class Apple extends Fruits
{
 void price()
 {
  System.out.println("1kg = 90");
 }
}

class Banana extends Fruits
{
 void price()
 {
  System.out.println("1kg = 67");
 }
}

class Mango extends Fruits
{
 void price()
 {
  System.out.println("1kg = 80");
 }
}

class Pazhamudhir
{
 static void purchase(Fruits f1)

 {
  f1.price();
 }
}

class Main1
{
 public static void main(String[] args)
 {
  Apple a1 = new Apple();
  Banana b1 = new Banana();
  Mango m1 = new Mango();

  Pazhamudhir.purchase(a1);
  Pazhamudhir.purchase(b1);
  Pazhamudhir.purchase(m1);
 }
}