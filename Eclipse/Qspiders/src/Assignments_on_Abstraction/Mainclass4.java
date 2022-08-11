package Assignments_on_Abstraction;


interface Bottle
{
 void drink();	
}

class Plastic implements Bottle
{
 public void drink()
 {
	 System.out.println("not recyclable");
 }
}

class Steel implements Bottle
{
	public void drink()
	{
		System.out.println("too weight");
	}
}

class Tupperware implements Bottle
{
	public void drink()
	{
		System.out.println("high price");
	}
	
}

class Stimulator4
{
 static void anscim(Bottle b)
 {
	 b.drink();
 }
}
public class Mainclass4 
{
 public static void main(String[] args)
 {
	 Plastic p = new Plastic();
	 Steel s = new Steel();
	 Tupperware t = new Tupperware();
	 
	 Stimulator4.anscim(p);Stimulator4.anscim(s);Stimulator4.anscim(t);
 }
}
