package Quarantine;

public class SortOut {

	public static void main(String[] args)
	{
	 int[] n = {1,0,0,1,1,1,1,0,1,1};
	 int count = 0;
	 int[] result = new int[n.length];
	 
	 for(int i = 0; i<n.length; i++)
	 {
		 if(n[i]==1)
		 {
			 count++;
		 }
	 }
  
	 for (int j = 0; j < n.length; j++) 
	 {
		 if(j<count)
		 {
			 result[j]=1;
		 }
		 else
		 {
			 result[j]=0;
		 }
		
	 }
	 for (int i = 0; i < result.length; i++) 
	 {
		System.out.print(result[i]);
	}
	}

}
