package Pattern;

public class Basic6 {

	public static void main(String[] args) 
	{  
		int no=1;
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(no);
				no++;
			}
			System.out.println();
			no = no+(4-i);
		}

	}

}
