class Sample
{ 
 int x = 3;
}
class Demo extends Sample //int x also virtually presnt here
{
 void add()
 {
  System.out.println("hey its add..."); 
 }
 }
class Singlelevelinheritance
{
 public static void main(String[] args)
 {
  System.out.println("----- Main starts-----");
   Demo d1 = new Demo();
  System.out.println("x value = " +d1.x);
  d1.add();
    System.out.println("----- Mains ends-----");

   

 }
}
