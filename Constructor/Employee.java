class Employee
{ 
 int emp_id;
 int emp_sal;
 char emp_grade;
 Employee(int a, int b, char c)
 {
  emp_id = a;
  emp_sal = b;
  emp_grade = c;
 }
 public static void main(String[] args)
 {
  Employee e1 = new Employee(26, 20000, 's');
  System.out.println("employee id ="+e1.emp_id);
  System.out.println("employee salary ="+e1.emp_sal);
  System.out.println("employee grade = "+e1.emp_grade);
 }
}