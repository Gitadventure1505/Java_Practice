package Encapsulation;

class Icici
{
 private int atmpin = 1234;
 public int getAtmpin()
 {
	 return atmpin;
 }
 
 public void setAtmpin(int change)
 {
	 atmpin = change;
 }
}

public class Dinga 
{
 public static void main(String[] args)
 {
	 Icici atmcard = new Icici();
	 System.out.println(atmcard.getAtmpin());
	 
	 atmcard.setAtmpin(7867);
	 System.out.println(atmcard.getAtmpin());
 }
}
