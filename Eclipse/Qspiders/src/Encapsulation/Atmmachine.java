package Encapsulation;


class Bank
{
	 private int bankbalance = 1000;
	 public int getBal()
	 {
		 return bankbalance;
	 }
	public void setDeposit(int x)
	{
		bankbalance =this. bankbalance+x;
	}
}
public class Atmmachine 
{
	public static void main(String[] args)
{
  Bank atmcard = new Bank();
  System.out.println(atmcard.getBal());
  
  atmcard.setDeposit(2000);
  System.out.println(atmcard.getBal());
}
}
