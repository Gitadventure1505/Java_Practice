class Sample2
{
void co()
{
 System.out.println("test approach");
}

}
class Guleyluu extends Sample2
{
 void dispu()
 {
  System.out.println("test methodology");
 }
}

class Main165
{
 public static void main(String[] args)
 {
  Sample2 s2 = new Guleyluu();
  s2.co();

  Guleyluu g1 = (Guleyluu) s2;
  g1.co();
  g1.dispu();
 }
}