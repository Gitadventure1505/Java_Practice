class Cool4
{
 void add()
 {
  System.out.println("helo");
 }
}

class Golata2 extends Cool4
{
 void dispu()
 {
  System.out.println("objective");
 }
 int r;
}

class Main170
{
 public static void main(String[] args)
 {
  Cool4 c = new Golata2();
  c.add();

  Golata2 g2 = (Golata2) c;
  g2.add();
  g2.dispu();
  System.out.println(g2.r);
 }
}