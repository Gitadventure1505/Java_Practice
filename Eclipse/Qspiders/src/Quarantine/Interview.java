package Quarantine;

public class Interview {

	public static void main(String[] args) 
	{
		String str = "Ramkumar is a QA Engineer";
		String str1 = "";
		for (int i = 0; i< str.length(); i++) 
		{
		 if(!(str.charAt(i)==' '))
		 {
	       str1= str1+str.charAt(i);
		 }
		 
		}
		System.out.println(str1);
	}

}
