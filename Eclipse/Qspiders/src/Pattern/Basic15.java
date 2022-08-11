package Pattern;

public class Basic15 {

	public static void main(String[] args) 
	{
      char ch = 'P';
      for (int i = 1; i <=4; i++) 
      {
		for (int j = 1; j <=i; j++)
		{
			System.out.print(ch);
			ch--;
		}
		System.out.println();
		ch = (char)(ch-(4-i));
	}
	}

}
