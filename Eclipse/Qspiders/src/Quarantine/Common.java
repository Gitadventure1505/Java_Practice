package Quarantine;

import java.util.Scanner;

public class Common {

	public static void main(String[] args) {
		                            
      Scanner sc =  new Scanner(System.in);
      String s1 = sc.next();
      String s2 = sc.next();
      System.out.println("Repeated charecters");
      for (int i = 0; i < s1.length(); i++) 
      {
		for (int j = 0; j < s2.length(); j++) 
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				
				System.out.print(s1.charAt(i)+" ");
			}
		}
	}
	}

}
