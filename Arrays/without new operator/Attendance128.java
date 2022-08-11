class Attendance128
{
 public static void main(String[] args)
 {
  double box[] = {98.5,94.3,65.5,89.4};
  System.out.println("---------------------");
  System.out.println("SEMESTERS\tATTENDANCE");
  System.out.println("---------------------");
  for(int i = 0; box.length>i; i++)
  {
   System.out.println("semester "+(i+1)+"\t"+box[i]);
  }
 }
}