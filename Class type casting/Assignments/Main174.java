class Cola1
{
 int f;
}

class Chungacha extends Cola1
{
 int d = 2;
}

class Main174
{
 public static void main(String[] args)
 {
  Cola1 c1 = new Chungacha();
  System.out.println(c1.f);

  Chungacha c2=(Chungacha) c1;
  System.out.println(c2.f);
  System.out.println(c2.d);
 }
}