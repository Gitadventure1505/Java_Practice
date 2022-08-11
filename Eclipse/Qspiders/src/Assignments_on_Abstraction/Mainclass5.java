package Assignments_on_Abstraction;

interface Mobiles
{
 void os();
}

class Samsung implements Mobiles
{
	public void os()
	{
		System.out.println("Android");
	}
	}

class Iphone implements Mobiles
{
 public void os()
 {
	 System.out.println("ios");
 }
}

class Lumia implements Mobiles
{
	public void os()
	{
		System.out.println("windows");
	}
}

class Stimulator5
{
 static void anscim(Mobiles m)
 {
	 
	m.os(); 
 }
}
public class Mainclass5
{
	 public static void main(String[] args)
	 {
		 Lumia l = new Lumia();
		 Iphone i = new Iphone();
		 Samsung s = new Samsung();
		 
		 Stimulator5.anscim(l);
		 Stimulator5.anscim(i);
		 Stimulator5.anscim(s);
	 }
}
