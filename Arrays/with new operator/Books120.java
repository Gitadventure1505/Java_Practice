class Books120
{
 public static void main(String[] args)
 {
  String[] box = new String[3];
  box[0]="ramkumar";
  box[1]="ashok";
  box[2]="siddhu";
  System.out.println("---------------------");
  System.out.println("BOOKS\tAUTHORS");
  System.out.println("---------------------");
  for(int i =0; i < box.length; i++)
  {
   System.out.println("book "+(i+1)+"\t"+box[i]);
  }
 }
}