
public class primeupto
{
 public static void main(String[] args)
   {
	 boolean prime;
       for(int i = 2; i<=100; i++)
    	   {
    	   prime = true;
	      for (int k =2; k<i; k++)
	      {
	    	  if(i%k==0)
	    	  {
	    		  prime = false;
	    		  break;
	    	  }
	      }  
	    	  if(prime == true)
	    	  {
	    		  System.out.print(i+" ");
	    	  }
	      
       }
   } 
 }
