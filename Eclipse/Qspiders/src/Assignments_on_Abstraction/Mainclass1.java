package Assignments_on_Abstraction;

interface Fruits
{
 void price();	
}

class Apple implements Fruits
{
	public void price()
	{
		System.out.println("1kg = 90");
	}
	}
class Mango implements Fruits
{
	public void price()
	{
		System.out.println("1kg = 80");
	}
	}

class Banana implements Fruits
{
	public void price()
	{
		System.out.println("1kg = 40");
	}
	}
class Stimulator1
{
	static void anscim(Fruits f )
	{
		f.price();
	}	
}
public class Mainclass1 {
public static void main(String[] args)
{
 Apple a = new Apple();
 Banana b = new Banana();
 Mango m = new Mango();
 
 Stimulator1.anscim(a);
 Stimulator1.anscim(b);
 Stimulator1.anscim(m);
 
}}
