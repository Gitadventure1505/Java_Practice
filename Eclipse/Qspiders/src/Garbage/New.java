package Garbage;

public class New
{
	static int b;
	static int a;
 New(int a, int b)
 {
	 this.a = b;
	 this.b = a;
 }
 public static void main (String[] args)
 {
	  a = 10;
	  b = 20;
	New n = new New(a,b);
	System.out.println(a);
 }
}
