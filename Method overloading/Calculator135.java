class Calculator135
{
 public static void main(String[] args)
 {
  new Calculator135().add(5,9.4);
  add(7.4,2);
  add(7.3,8.3);
 }
  void add(int a, double d)
  {
   double ans = a+d;
   System.out.println(ans);
  }
  static void add(double s, int f)
  {
    double ans = s+f;
    System.out.println(ans);
  }
   static void add(double g, double j)
   {
    double ans= g+j;
    System.out.println(ans);
   }

}