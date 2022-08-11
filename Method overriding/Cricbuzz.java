class Cricbuzz_v1
{
 void display()
 {
  System.out.println("scores and commentary");
 }
}
class Cricbuzz_v2 extends Cricbuzz_v1
{
 void display()
 {
  System.out.println("rankings,statistics,records");
  super.display();
 }
}
class Cricbuzz
{
 public static void main(String[] args)
 {
  Cricbuzz_v2 c1 = new Cricbuzz_v2();
  c1.display();
 }
}