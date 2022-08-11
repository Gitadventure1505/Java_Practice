package Javaquiz;

public class Thirdone 
{
 public static void main(String[] args)
 { 
	 int arr[] = {1,2,3,4};
	 int arr1[] = new int[(arr.length+1)];
	 int i = arr1.length;
	try 
	 {
	while(i<=i)
   	 {
	System.out.println(arr[i]);
	 
	   }
	 }
	 catch(ArrayIndexOutOfBoundsException a)
	 {
		 arr1[i-1] = i;
	 }
	 for (int k = 0; k <arr1.length-1; k++)
	 {
		 arr1[k] = arr[k]*2;
		 System.out.print(arr1[k]+" ");
	 }
	 System.out.println(arr1[4]*2);
}
}