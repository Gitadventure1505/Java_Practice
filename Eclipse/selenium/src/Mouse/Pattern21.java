package Mouse;

public class Pattern21 {

	public static void main(String[] args) 
	{
		int no = 10;
		for (int i = 1; i<=4; i++) 
		{
		  for (int j = 4; j>=i; j--) 
		  {
			  System.out.print(no);   // +0,+1,+2,+3
			  no--;
		}	
		  System.out.println();
		 
		  
		}


	}

}
