class Marks133
{
 public static void main(String[] args)
 {
  int [] box = {78,34,43,33};
  System.out.println("---------------------");
  System.out.println("Subjects\tmarks");
  System.out.println("---------------------");
  for(int i = 0; i<box.length; i++)
  {
   System.out.println("Maths "+(i+1)+" \t "+box[i]);
  }
 }
}