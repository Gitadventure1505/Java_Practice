class Bill123
{
 public static void main(String[] args)
 {
  String[] box = new String[4];
  box[0] = "idly";
  box[1] = "dosa";
  box[2] = "vada";
  box[3] = "puri";
  System.out.println("---------------------");
  System.out.println("BILL_ID\t ITEMS");
  System.out.println("---------------------");
  for(int i = 0; i<box.length; i++)
  {
   System.out.println("item "+(i+1)+"\t "+box[i]);
  }
 }
}