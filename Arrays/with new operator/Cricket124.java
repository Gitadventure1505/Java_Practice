class Cricket124
{
 public static void main(String[] args)
 {
  int[] box = new int[3];
  box[0] = 198;
  box[1] = 120;
  box[2] = 98;
  System.out.println("---------------------");
  System.out.println("PLAYERS \t SCORES");
  System.out.println("---------------------");
  for(int i =0; i <box.length; i++)
  {
   System.out.println("player "+(i+1)+" \t "+box[i]);
  }
 }
}