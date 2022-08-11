package Encapsulation;

class Googlesheets
{
 private String pdf = "Testcase";
 public String getPdf()
 {
	 return pdf;
	 
 }
 
 public void setPdf(String pdf)
 {
	 this.pdf = pdf;
	 
 }
}



public class Usera 
{
 public static void main(String[] args)
 {
	Googlesheets access = new Googlesheets();
	System.out.println(access.getPdf());
	
	access.setPdf("updated testcase");
	System.out.println(access.getPdf());
	
 }
}
