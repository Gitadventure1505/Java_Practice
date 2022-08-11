class School
{
 String scl_name;
 char scl_grade;
 int scl_strength;
School(String a, char b, int c)
{
 scl_name = a;
 scl_strength =c;
 scl_grade = b;
}
public static void main(String[] args)
{
 School s1 = new School("kamak", 'A', 565);
 System.out.println("school name = "+s1.scl_name);
 System.out.println("school grade =" +s1.scl_grade);
 System.out.println("school strength ="+s1.scl_strength);
}
}