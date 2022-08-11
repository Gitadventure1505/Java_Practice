package Programs.jan7;

public class Student 
{
  String stdname;
  char schoolgrade;
  int stdid;
  Student(String stdname, char schoolgrade, int stdid)
  {
	  this.stdname = stdname;
	  this.schoolgrade = schoolgrade;
	  this.stdid = stdid;
  }
  public static void main(String[] args)
  {
	  Student std1 = new Student("ram",'A',454);
	  System.out.println(std1.stdname);
	  System.out.println(std1.schoolgrade);
	  System.out.println(std1.stdid);
  }
}
