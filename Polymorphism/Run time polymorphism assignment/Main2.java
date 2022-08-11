class Cricket
{
 void date()
 {
  System.out.println("bcci announce date");
 }
}

class Odi extends Cricket
{
 void date()
 {
  System.out.println("on 12th january ");
 }
}

class Test extends Cricket
{
 void date()
 {
  System.out.println("on 14th january");
 }
}

class T20 extends Cricket
{
 void date()
 {
  System.out.println("on 16th january");
 }
}

class Schedule
{
 static void board(Cricket c1)
 {
  c1.date();
 }
}
 class Main2
 {
  public static void main(String[] args)
  {
   Odi o = new Odi();
   T20 t = new T20();
   Test t1 = new Test();

   Schedule.board(o);
   Schedule.board(t);
   Schedule.board(t1);
  }
 }
