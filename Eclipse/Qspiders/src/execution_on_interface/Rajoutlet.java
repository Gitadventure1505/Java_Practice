package execution_on_interface;

interface Nike
{
	void bags();
}

interface Puma extends Nike
{
	void shoes();
	}

abstract class Ownership implements Puma
{
  public void bags()
  {
	  System.out.println("all type of bags");
  }
}
public class Rajoutlet extends Ownership
{
	protected String s1 = "Hiii";
	public void shoes()
	{
		System.out.println("all type shoes");
	}
   public static void main(String[] args)
   {
	   Rajoutlet r = new Rajoutlet();
	   String s1 = new Integer(45).toString();
	   System.out.println(s1);
	   r.shoes();
	   r.bags();
   }
}
