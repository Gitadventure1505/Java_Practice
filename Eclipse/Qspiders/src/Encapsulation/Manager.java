package Encapsulation;


class Accounts
{
	private int empsal = 25000;
	public int getSal()
	{
		return empsal;
	}
	
	public void setSal(int bonus)
	{
		this.empsal = bonus+empsal;
	}
}
public class Manager 
{
	public static void main(String[] args)
	{
		Accounts slip = new Accounts();
		System.out.println(slip.getSal());
		
		slip.setSal(2500);
		System.out.println(slip.getSal());
	}

}
