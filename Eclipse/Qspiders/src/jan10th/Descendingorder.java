package jan10th;

public class Descendingorder 
{
	public static void main(String[] args)
	{
		int box[] = {76,43,56,99,6,2,87,33};
      for(int k = 1; k<box.length; k++ )
      {
		for(int i = 0; i<box.length-k; i++  )
		{
		 if(box[i]<box[i+1])
		 {
		   int c;
		   c = box[i];
		   box[i]= box[(i+1)];
		   box[(i+1)] = c;
		   
		 }
		}
      }
      for(int i = 0; i<box.length; i++)
      {
    	  System.out.println(box[i]);
      }
	}

}
