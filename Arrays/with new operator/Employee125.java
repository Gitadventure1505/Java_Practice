class Employee125
{
 public static void main(String[] args)
 {
  String[] box = new String[3];
  box[0] = "shestri";
  box[1] = "iyer";
  box[2] = "aswin";
  System.out.println("---------------------");
  System.out.println("EMPID\tEMPNAME");
  System.out.println("---------------------");
  for(int i = 0; i < box.length; i++)
  {
   System.out.println("employee " +(i+1)+"\t"+box[i]);
  }
 }
}