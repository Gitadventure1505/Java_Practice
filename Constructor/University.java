class University
{
 String uni_name;
 String cou_name;
 int exam_cost;
 University(String a, String b, int c)
 {
  uni_name = a;
  cou_name = b;
  exam_cost = c;
 }
 public static void main(String[] args)
 {
  University u1 = new University("anna", "civil",1500);
  System.out.println("university name = "+u1.uni_name);
  System.out.println("course name ="+u1.cou_name);
  System.out.println("exam fees =" +u1.exam_cost);
 }
}