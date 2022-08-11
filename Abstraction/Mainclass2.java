package Assignments;

interface Cricket
{
	void date();
	}
class T20 implements Cricket
{
	public void date()
	{
		System.out.println("jan1");
	}
	}

class Odi implements Cricket
{
	public void date()
	{
		System.out.println("jan3");
	}
	}
class Test implements Cricket
{
	public void date()
	{
		System.out.println("5th jan");
	}
	}
class Stimulator2 
{
 static void anscim(Cricket c)
 {
	 c.date();
 }
}
public class Mainclass2 {
	public static void main(String[] args)
	{
		T20 t = new T20();
		Odi o = new Odi();
		Test t1 = new Test();
		
		Stimulator2.anscim(t);
		Stimulator2.anscim(o);
		Stimulator2.anscim(t1);
	}

}
