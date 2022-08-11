class Demo
{
 int x;
}


class  Sample extends Demo
{
  void hot()
  {
   System.out.println("im cool");
  }
}


class Execution
{
 public static void main(String[] args)
 {
  Demo d1 = new Sample();        //upcasting
  System.out.println(d1.x);

  Sample s1=(Sample)d1;          //downcasting
  System.out.println(s1.x);
  s1.hot();
 }
}