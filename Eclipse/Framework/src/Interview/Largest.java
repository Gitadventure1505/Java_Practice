package Interview;

public class Largest {

	public static void main(String[] args) 
	{
		int[] arr = {12,34,54,6,12,10};
		int max=0;
		int min = 100; //Take any random large number
		for (int i = 0; i < arr.length; i++) 
		{
			if(max<arr[i])
			{
			max = arr[i];
			}
			if(min>arr[i])
			{
			min = arr[i];
			}
		}
		System.out.println(max+min);
	}

}
