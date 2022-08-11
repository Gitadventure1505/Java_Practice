package Innovative;

public class Large {

	public static void main(String[] args) 
	{
      int[] arr = {2,6,8,4,3,2,3,4,6,7,9,9,8,7,6,5,33,3,};
      int large = 0;
      for (int i = 0; i < arr.length; i++) 
      {
    	  if(arr[i]>large)
    	  {
    		  large = arr[i];
    	  }
	}
      System.out.println("largest number is "+large);
	}

}
