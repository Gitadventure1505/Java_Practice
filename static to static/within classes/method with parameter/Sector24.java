class Sector24
{
 static void Area(double theta, int r)
  {
   double result =(r*theta)/2;
   System.out.println("Area = " + result);
  }
   public static void main(String[] args)
   {
    Area(22.5, 3);
   }
}