class Marks119
{
 public static void main(String[] args)
 {
  int [] box = new int[4];
  box[0]=67;
  box[1] = 78;
  box[2] = 89;
  box[3] = 97;
  System.out.println("---------------------");
  System.out.println("Subjects\tmarks");
  System.out.println("---------------------");
  for(int i = 0; i<box.length; i++)
  {
   System.out.println("Maths "+(i+1)+"\t"+box[i]);
  }
 }
}