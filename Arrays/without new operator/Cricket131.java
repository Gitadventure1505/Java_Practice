class Cricket131
{
 public static void main(String[] args)
 {
  int[] box = {67,34,67,74,34};
  System.out.println("---------------------");
  System.out.println("PLAYERS \t SCORES");
  System.out.println("---------------------");
  for(int i =0; i <box.length; i++)
  {
   System.out.println("player "+(i+1)+" \t "+box[i]);
  }
 }
}