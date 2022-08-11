package execution_on_interface;
interface samplu
{
	 void cool();
	 void chill();
}
	
abstract class demu implements samplu
{
	public void cool()
	{
		System.out.println("cooler");
	}
	}
public class Testeru extends demu
{
  public void chill()
  {
	  System.out.println("chillax");
  }
  public static void main(String[] args)
  {
	  Testeru t1 = new Testeru();
	  t1.cool();
	  t1.chill();
  }
}
