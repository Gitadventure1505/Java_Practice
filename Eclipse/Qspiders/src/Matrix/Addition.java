package Matrix;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
		int mat1[][] = new int[3][5];
		int mat2[][] = new int[3][5];
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<=mat1.length-1; i++)
		{
			for(int j = 0; j<=4; j++)
			{
				mat1[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<=mat1.length-1; i++)
		{
			for(int j = 0; j<=4; j++)
			{
				System.out.print(mat1[i][j]);
			}
			System.out.println();
		}
		
			

		

	}

}
