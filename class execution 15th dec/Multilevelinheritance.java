class Tester1
{
 int q = 6;
}
class Demo1 extends Tester1 //int q is virtually present here
{
  void add()
  {
     System.out.println("hey its add");
  }
}
class Sample1 extends Demo1 //int q and add() is virtually prent here
{
 void disp()
 { 
    System.out.println("hey its disp");

 }
}
class Multilevelinheritance
{
 public static void main(String[] args)
 {
   System.out.println("----- Main starts-----");
  Sample1 s1 = new Sample1();
      System.out.println("q value = "+s1.q);
      s1.add();
      s1.disp();
    System.out.println("----- Main ends-----");

  
 }
}