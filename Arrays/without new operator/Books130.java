class Books130
{
 public static void main(String[] args)
 {
  String[] box = {"ram","kumar","babu"};
  System.out.println("---------------------");
  System.out.println("BOOKS\tAUTHORS");
  System.out.println("---------------------");
  for(int i =0; i < box.length; i++)
  {
   System.out.println("book "+(i+1)+"\t"+box[i]);
  }
 }
}