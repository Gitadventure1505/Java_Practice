class Cola13
{
 int f;
 void disp()
 {
  System.out.println("heeapa");
 }
} 

class Chungach extends Cola13
{
 int d;
}

class Main173
{
 public static void main(String[] args)
 {
  Cola13 c3 = new Chungach();
  c3.disp();
  System.out.println(c3.f);

  Chungach c4 = (Chungach) c3;
  c4.disp();
  System.out.println(c4.d);
  System.out.println(c4.f);
 }
}