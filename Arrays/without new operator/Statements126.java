class Statements126
{
 public static void main(String[] args)
 {
  boolean[] box = {true,false,true,false};

  System.out.println("---------------------");
  System.out.println("STATEMENTS\tRESULT");
  System.out.println("---------------------");
  for(int i = 0; i < box.length; i++)
  {
   System.out.println("Statement "+(i+1)+"\t"+box[i]);
  }
 }
}