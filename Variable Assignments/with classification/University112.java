class University112
{
 static String uni_name = "Anna";
 String dep_name;
 int e_fees;
 public static void main(String[] args)
 {
  University112 u1 = new University112();
  u1.dep_name = "civil";
  u1.e_fees = 1500;
  System.out.println("university name = "+uni_name);
  System.out.println("department name = "+u1.dep_name);
  System.out.println("exam fees = "+ u1.e_fees);
 }
}