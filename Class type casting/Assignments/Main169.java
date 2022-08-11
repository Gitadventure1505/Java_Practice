class Tester3
{
 int r;
 void disp()
 {
  System.out.println("diwali");
 }
}

class Tista1 extends Tester3
{
void ulliya()
{
 System.out.println("pongal");
}
}

class Main169
{
 public static void main(String[] args)
 {
  Tester3 t3 = new Tista1();
  t3.disp();
  System.out.println(t3.r);

  Tista1 t1 = (Tista1) t3;
  t1.disp();
  t1.ulliya();
  System.out.println(t1.r);
 }
}