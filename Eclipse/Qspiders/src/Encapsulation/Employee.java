package Encapsulation;

class Company
{
	private int empid = 133;
	
	
	public int getId()
	{
		return empid;
	}
	
	
	public void setId(int num)
	{
	empid = num;
		
	}
}

public class Employee 
{
	public static void main(String[] args)
	{
		
 Company card = new Company();
 System.out.println(card.getId());
 
  card.setId(231); 
  System.out.println(card.getId());
 
 
	}
 

 
}
