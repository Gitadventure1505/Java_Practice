class Attendance121
{
 public static void main(String[] args)
 {
  double box[] = new double[4];
  box[0]=98.6;
  box[1]=90.44;
  box[2] = 84.77;
  box[3] = 78.66;
  System.out.println("---------------------");
  System.out.println("SEMESTERS\tATTENDANCE");
  System.out.println("---------------------");
  for(int i = 0; box.length>i; i++)
  {
   System.out.println("semester "+(i+1)+"\t"+box[i]);
  }
 }
}