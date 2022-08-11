class Age127
{
 public static void main(String[] args)
 {
  int[] box = {76,78,87,99};
  System.out.println("---------------------");
  System.out.println("persons \t Ages");
  System.out.println("---------------------");
  for(int i = 0; i < box.length; i++)
  {
   System.out.println("person "+(i+1)+" \t "+box[i]);
  }
 }
}