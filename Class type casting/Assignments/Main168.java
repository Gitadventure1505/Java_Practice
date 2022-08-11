class Cool2
{
 void disp()
 {
  System.out.println("hello");
 }
}
class Dinga extends Cool2
{
 int  x;
 void tata()
 {
  System.out.println("objective");
 }
}
class Main168
{
 public static void main(String[] args)
 {
  Cool2 c2 = new Dinga();
  c2.disp();

  Dinga d = (Dinga)c2;
  d.tata();
  d.disp();
  System.out.println(d.x);
 }
}