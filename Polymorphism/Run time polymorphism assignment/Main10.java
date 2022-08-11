class Pen
{
 void write()
 {
  System.out.println("write in note");
 }
}

class Inkpen extends Pen
{
 void write()
 {
  System.out.println("water erases");
 }
}

class Gel extends Pen
{
 void write()
 {
  System.out.println("write fluent");
 }
}

class Refill extends Pen
{
 void write()
 {
  System.out.println("refill the ink");
 }
}

class Stationery
{
 static void buy(Pen p)
 {
  p.write();
 }
}

class Main10
{
 public static void main(String[] args)
 {
  Inkpen i = new Inkpen();
  Gel g = new Gel();
  Refill r = new Refill();

  Stationery.buy(i);
  Stationery.buy(g);
  Stationery.buy(r);
 }
}