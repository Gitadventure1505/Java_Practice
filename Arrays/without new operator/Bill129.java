class Bill129
{
 public static void main(String[] args)
 {
  String[] box = {"idly","vadai"};

  System.out.println("---------------------");
  System.out.println("BILL_ID\t ITEMS");
  System.out.println("---------------------");
  for(int i = 0; i<box.length; i++)
  {
   System.out.println("item "+(i+1)+"\t "+box[i]);
  }
 }
}