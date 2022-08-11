class Notes
{
 void carry()
 {
  System.out.println("written note");
 }
}

class Sql extends Notes
{
 void carry()
 {
  System.out.println("queries");
 }
}

class Java extends Notes
{
 void carry()
 { 
  System.out.println("programms");
 }
}

class Manual extends Notes
{
 void carry()
 {
  System.out.println("Testcases");
 }
}

class Student
{
 static void bag(Notes n)
 {
  n.carry();
 }
}

class Main8
{
 public static void main(String[] args)
 {
  Sql s = new Sql();
  Java j = new Java();
  Manual m = new Manual();

  Student.bag(s);
  Student.bag(j);
  Student.bag(m);
 }
}