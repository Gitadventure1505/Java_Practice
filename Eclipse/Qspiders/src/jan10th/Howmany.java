package jan10th;

public class Howmany 
{
	
 public static void main(String[] args)
 {
	 int count =0;

	 int box[] = {1,3,2,4,9,5,6,7,8,0,4,4,4,4};
	 for(int i = 0; i<box.length; i++)
	 {
	
	      if(box[i]==4)
	      {
		 count++;
	      }
	 }
	 System.out.println(count);
 }
}
