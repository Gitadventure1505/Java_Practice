package Pattern;

public class Basic24 {

	public static void main(String[] args) 
	{
         int space = 3;
         for(int  i = 4; i>=1; i--)
         {
        	 for(int j = 1; j<=4; j++)
        	 {
        		 if(j<=space)
        		 {
        			 System.out.print(' ');
        		 }
        		 else
        		 {
        			 System.out.print(i);
        		 }
        		 
        	 }
        	 space--;
    		 System.out.println();
         }
	}

}
