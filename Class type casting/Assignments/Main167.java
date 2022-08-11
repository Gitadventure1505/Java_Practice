class Tester1
{
 int x;
 void disp()
 {
  System.out.println("hello");
 }
}
class Huliyacha extends Tester1
{
 void ho()
 {
  System.out.println("test");
 }
}
class Main167
{
 public static void main(String[] args)
 {
  Tester1 t = new Huliyacha();
  t.disp();
  System.out.println(t.x);
  Huliyacha h = (Huliyacha) t;
  h.disp();
  System.out.println(h.x);
  h.ho();

 }
}