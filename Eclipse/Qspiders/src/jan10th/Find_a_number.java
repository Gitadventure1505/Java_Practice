package jan10th;

public class Find_a_number 
{
	public static void main(String[] args)
	{
	int box[] = {1,3,2,4,9,5,6,7,8,0};
	for(int i =0; i<box.length; i++)
	{
	  if(box[i]==0)
	  {
	 	System.out.println("number present in "+i+"th indices in box array");
	  }
	}
	}	

}
