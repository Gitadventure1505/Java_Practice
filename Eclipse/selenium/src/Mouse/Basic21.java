package Mouse;

public class Basic21 
{
	public static void main(String[] args)
	{
		int space = 3;
      for(int  i = 1; i<=4; i++)
      {
    	  for(int j = 1; j<=4; j++)
    	  {
    		  if(j<=space)
    		  {
    			  System.out.print(' ');
    		  }
    		  else
    		  {
    			  System.out.print('*');
    		  }
    	  }
    	  System.out.println();
    	  space--;
      }

	}
}
