package string;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
	 String str = sc.next();// VETAYYADUVELAYADU
	 char[] arr = str.toCharArray();
	 str = "";
	
	  
	for (int i = 0; i < arr.length; i++) 
	 {
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[i]==arr[j])
				arr[j]= '@';
		}
	}
	
	 for (int i = 0; i < arr.length; i++) 
	 {
		 if (!(arr[i] == '@'))
		 str = str+arr[i];
		 	 
	}
	 System.out.print(str);
	
	
	  

	}

}
