package Assignments_on_Abstraction;

interface Note
{
void write();
}


class Java1 implements Note
{
public void write()
{
   System.out.println("programs");	
}
}


class Manual1 implements Note
{
	public void write()
	{
		System.out.println("test cases");
	}
	}


class Sql1 implements Note
{
 public void write()
 {
  System.out.println("queries");
 }
}

class Student
{
 static void bag(Note n)
 {
	 n.write();
	 
 }
}


public class Mainclass10 
{
 public static void main(String[] args)
 {
	 
	 Manual1 m = new Manual1();
	 Sql1 s = new Sql1();
	 Java1 j = new Java1();
	 
	 Student.bag(m);
	 Student.bag(s);
	 Student.bag(j);
	 
	 
 }
}
