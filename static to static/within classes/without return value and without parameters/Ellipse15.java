class Ellipse15
{ 
   static void ellipse()
   {
      final float pie = 3.14f;
      byte a = 6;
      byte b = 8;
      float area = pie*a*b;
      System.out.println("Area = "+ area);
   }
      public static void main(String[] args)
      {
         System.out.println("----calc starts----");
	 ellipse();
	 System.out.println("----cal ends----");
      }
}