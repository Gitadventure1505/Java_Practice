package Javaquiz;

public class Bubblesort
{
	static int te;
	public static void main(String[] args)
	{
int arr[] = { 90,50,6,78,7};
for(int k = 1; k<arr.length; k++){
for(int i = 0; i <arr.length-k; i++)
{
if(arr[i]<arr[i+1])
{
  te = arr[i+1];
  arr[i+1]=arr[i];
  arr[i] = te;
}
	}
	}
for (int o = 0; o<arr.length; o++ )
{
 System.out.print(arr[o]+"  ");	
}
	}
}
