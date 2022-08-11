package execution_on_interface;

interface Demo
{
	void disp();
	void test();
}

class Tester implements Demo
{
	public void disp()
	{
		System.out.println("hello");
	}
	public void test()
	{
		System.out.println("hi");
	}
	
}







public class Mainclass1 
{
	public static void main(String[] args) 
	{
		Tester t1 = new Tester();
		t1.disp();
		t1.test();
	}

}
