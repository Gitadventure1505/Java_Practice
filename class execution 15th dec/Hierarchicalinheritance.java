class Sample2
{
 int a = 8;
}
class Demo2 extends Sample2 // int a is virtually present here
{
 void add()
 {
    System.out.println("hey its add..");

 }
}
class Tester2 extends Sample2 // int a is virtually present here
{
 void disp()
 {
    System.out.println("hey its disp........");


 }
}
class Hierarchicalinheritance
{
	 public static void main(String[] args)
	{
      Tester2 t2 = new Tester2();
	  Demo2 d2 = new Demo2();
	    System.out.println("-------Demo1 starts-------");
		  System.out.println("a value = "+d2.a);
		  d2.add();
		    System.out.println("----- Tester starts-----");
			  System.out.println("a value = "+t2.a);
                t2.disp();




	 }
}
