class Square51
{
 public static void main(String[] args)
 {
  int squ1 = Operation1.area();
  int squ4 = squ1*4;
  System.out.println("Area of 4 square ="+squ4);

 }
}
class Operation1
{
 static int area()
 {
 int a=2;
 int ans = a*a;
 return ans;
 }
}