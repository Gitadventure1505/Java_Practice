package Abstraction;
interface Animal
{
	void noise();
}

class Dog implements Animal
{
	public void noise()
	{
		System.out.println("boww");
	}
	}
class Cat implements Animal

{
	public void noise()
	{
		System.out.println("meow");
	}
	}

class Snake implements Animal

{
	public void noise()
	{
		System.out.println("shhhhh");
	}
	}
class Stimulator
{
	static void anscim(Animal a1)
	{
		a1.noise();
	}
	}
public class Mainclass {
 public static void main(String[] args) {
	Dog d = new Dog();
	Cat c = new Cat();
	Snake s = new Snake();
	
	Stimulator.anscim(d);
	Stimulator.anscim(c);
	Stimulator.anscim(s);

}
}
