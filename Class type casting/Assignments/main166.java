class Sample
{
 void disp()
 {
  System.out.println("Objective");
 }
}
class Ampules extends Sample
{
 void tata()
 {
  System.out.println("Aim");
 }
}
class Main166
{
 public static void main(String[] args)
 {
  Sample s1 = new Ampules();
  s1.disp();
  Ampules a1 = (Ampules)s1;
  a1.disp();
  a1.tata();
 }
}