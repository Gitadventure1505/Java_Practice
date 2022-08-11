
interface Pen
{
 void write();	
}

class Refill implements Pen
{
 public void write()
 {
	 System.out.println("Can refill");
	 
 }
}

class Gel implements Pen
{
 public void write()
 {
	 System.out.println("write fluently");
 }
}

class Inkpen implements Pen
{
 public void write ()
 {
	 System.out.println("ink over");
 }
}

class Stationery 
{
	static void shop(Pen p)
	{
		p.write();
		
	}
}


public class Mainclass9 
{
	public static void main(String[] args)
	{
		Inkpen i = new Inkpen();
		Gel g  = new Gel();
		Refill R = new Refill();
		
		Stationery.shop(i);
		Stationery.shop(g);
		Stationery.shop(R);
	}

}
