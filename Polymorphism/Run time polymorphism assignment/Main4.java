class Bottle
{
 void drink()
 {
  System.out.println(" liquid ");
 }
}
class Plastic extends Bottle
{
 void drink()
 {
  System.out.println("water");
 }
}
class Steel extends Bottle
{
 void drink()
 {
  System.out.println("hot water");
 }
}
class Wooden extends Bottle
{
 void drink()
 {
  System.out.println("cold water");
 }
}

class Lunch
{
static void bag(Bottle b)
 {
  b.drink();
 }
}

class Main4
{
 public static void main(String[] args)
 {
  Plastic p = new Plastic();
  Wooden w = new Wooden();
  Steel s = new Steel();

  Lunch.bag(p);
  Lunch.bag(w);
  Lunch.bag(s);
 }
}