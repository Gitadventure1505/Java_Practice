package Garbage;

public class This 
{
	static int ram =5;
	int kumar;
	 This(int ram)
	{
		this.ram =ram;
		kumar = ram;
		int n = ram;
	}
 public static void main(String[] args)
 {
	 This t = new This(7);
	 System.out.println(t.ram);
	 System.out.println(t.kumar);
 }
}
