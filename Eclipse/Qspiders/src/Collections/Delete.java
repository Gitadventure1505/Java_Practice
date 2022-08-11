package Collections;

public class Delete 
{
public static void main(String[] args)
{
 int[] arr = {83,45,13,87};
 for(int k = 1; k<=arr.length; k++) 
 {
 for(int i = 0; i<arr.length-k; i++ )
 {
 if(arr[i]<arr[i+1])
 {
	 int c = arr[i+1];
	 arr[i+1]=arr[i];
	 arr[i] = c;
 }
 }
 }
 for(int l = 0; l<arr.length; l++)
 {
	 System.out.print(arr[l]);
 }
}
}
