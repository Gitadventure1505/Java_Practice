package Assignments_on_Abstraction;


interface Bus
{
 void travel();	
}

class Airbus implements Bus
{
	public void travel()
	{
		System.out.println("no jerk");
		
	}
	}

class Sleeper implements Bus
{
 public void travel()
 {
	 System.out.println("sleep and go");
 }
}

class Ksrtc implements Bus
{
  public void travel()
  {
	  System.out.println("low fare");
  }
	
}

class Stimulator7
{
 static void anscim(Bus b)
 {
	 b.travel();
 }
}
public class Mainclass7 
{
	public static void main(String[] args)
	{
		Airbus a = new Airbus();
		Sleeper s = new Sleeper();
		Ksrtc k = new Ksrtc();
		
		Stimulator7.anscim(s);
		Stimulator7.anscim(a);
		Stimulator7.anscim(k);
	}

}
