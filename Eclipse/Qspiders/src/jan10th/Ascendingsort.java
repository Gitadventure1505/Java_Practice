package jan10th;

public class Ascendingsort
{

	 public static void main(String[] args)
	 {
		 int box[] = {76,43,56,99,6,2,87,33}; 
		 /*i want to compare 7 times in first itterative  itterative
		  and also*/
		for(int k = 1; k<box.length; k++)
		{
         for(int i = 0; i<=(7-k); i++)
         {
        	 
		 if(box[i]>box[i+1])
		   { 
			 box[i]=box[i]+box[i+1];
			 box[i+1] = box[i]-box[i+1];
			 box[i]= box[i]-box[1+i];
		   } 
		 }
		} 
		for(int i = 0; i <=7; i++)
		 System.out.print(box[i]+" ");
		 
	 }
}

