class Statements122
{
 public static void main(String[] args)
 {
  boolean[] box = new boolean[4];
  box[0] = true;
  box[1]= true;
  box[2]=false;
  box[3]=true;
  System.out.println("---------------------");
  System.out.println("STATEMENTS\tRESULT");
  System.out.println("---------------------");
  for(int i = 0; i < box.length; i++)
  {
   System.out.println("Statement "+(i+1)+"\t"+box[i]);
  }
 }
}