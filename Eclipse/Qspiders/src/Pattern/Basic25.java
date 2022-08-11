package Pattern;

public class Basic25 {

	public static void main(String[] args) 
	{
		int space = 3; 
		int star = 1;
		for(int i =1; i<=4; i++)
		{
			int no = 1;
			for(int j = 1; j<=space; j++)
			{
				System.out.print(' ');
			}
			for (int k = 1; k<=star; k++) 
			{
				System.out.print(no);
				no++;

			}
			System.out.println();
			star++;
			space--;
		}

	}

}
