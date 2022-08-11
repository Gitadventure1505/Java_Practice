class Employee132
{
 public static void main(String[] args)
 {
  String[] box = {"krish","kumari","asha"};
  System.out.println("---------------------");
  System.out.println("EMPID\tEMPNAME");
  System.out.println("---------------------");
  for(int i = 0; i < box.length; i++)
  {
   System.out.println("employee " +(i+1)+"\t"+box[i]);
  }
 }
}