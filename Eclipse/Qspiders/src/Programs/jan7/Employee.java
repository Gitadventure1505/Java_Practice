package Programs.jan7;

public class Employee 
{

	 int empid;
	 String empname;
	 Employee(int empid, String empname)
	 {
		 this.empid = empid;
		 this.empname = empname;
	 }
	 public static void main(String[] args)
	 {
		 Employee e1 = new Employee(123, "ramu");
		 System.out.println(e1.empid);
		 System.out.println(
				 e1.empname);
	 }
}
