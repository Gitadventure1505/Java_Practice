package Assignments_on_Abstraction;


interface Electricdevice
{
 void current();	
}

class Fan implements Electricdevice
{
 public void current()
 {
	 
	 System.out.println("blows air");
 }
}

class Fridge implements Electricdevice
{
 public void current()
 {
	 System.out.println("preserve items");
 }
}

class Ac implements Electricdevice
{
 public void current()
 {
	 System.out.println("chills room");
 }
}

class Home
{
 static void plugboard(Electricdevice e)
 {
  e.current();	
 }
}


public class Mainclass8 
{
	public static void main(String[] args)
	{
		Fan f = new Fan();
		Fridge f1 = new Fridge();
		Ac a = new Ac();
		
		Home.plugboard(f);
		Home.plugboard(f1);
			Home.plugboard(a);
	}

}
