package Javaquiz;

public class ReverseNumber 
{
 public static void main(String[] args)
 {
	 int[] arr = {9,8,7,6,5,4,3,2,1};
	 
			for(int i = 1; i <=arr.length/2; i++)
			{
			int temp = arr[arr.length-i];
					arr[arr.length-i]=arr[i-1];
					arr[i-1] = temp;
			}
			for(int k = 0; k<arr.length; k++)
			System.out.print(arr[k]);
 }
}
