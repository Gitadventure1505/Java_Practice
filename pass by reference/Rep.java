class Teacher
{
 void note()
 {
  System.out.println("note recieved");
 }
}
class Rep
{
 public static void main(String[] args)
 {
  Teacher t2 = new Teacher();
  Student1.get(t2);
  Student2 s = new Student2();
  s.get(t2);
 }
}
class Student1
{
 static void get(Teacher a)
 {
  a.note();
 }
}
class Student2
{
 void get(Teacher b)
 {
  b.note();
 }
}
