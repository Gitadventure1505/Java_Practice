class Sector17
{
   static void Sector()
   {
      byte r = 20;
      float theta = 30.5f;
      float area = (theta*r*r)/2;
      System.out.println("area = " +area);
   }
      public static void main(String[] args)
      {
         System.out.println("----cal starts----");
	 Sector();
	 System.out.println("----cal ends----");
      }
}