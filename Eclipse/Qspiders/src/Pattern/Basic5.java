package Pattern;

public class Basic5 {

	public static void main(String[] args) 
	{
        int no=4;
		for(int i = 1; i<=4; i++)
		{
			for(int j = 1; j<=i; j++)
				
			{
				System.out.print(no);
			}
			no--;
			System.out.println();
		}
		for(int i = 4; i>=1; i--)
		{
			for(int j = 4; j>=i; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
