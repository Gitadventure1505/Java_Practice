class Age118
{
 public static void main(String[] args)
 {
  int[] box = new int[4];
  box[0]=22;
  box[1]=23;
  box[2]=32;
  box[3]=34;
  System.out.println("---------------------");
  System.out.println("persons \t Ages");
  System.out.println("---------------------");
  for(int i = 0; i < box.length; i++)
  {
   System.out.println("person "+(i+1)+" \t "+box[i]);
  }
 }
}