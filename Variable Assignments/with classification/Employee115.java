class Employee115
{
 static char emp_grade = 'S';
 int emp_id;
 int emp_sal;
 public static void main(String[] args)
 {
  Employee115 e1 = new Employee115();
  e1.emp_id = 323;
  e1.emp_sal = 30000;
  System.out.println("employee grade = " +emp_grade);
  System.out.println("employee salary = " +e1.emp_sal);
  System.out.println("employee id = " + e1.emp_id );
 }
}