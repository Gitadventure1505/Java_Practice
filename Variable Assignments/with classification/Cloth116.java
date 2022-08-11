class Cloth116
{
 static int cl_cost = 1000;
 char cl_size;
 String cl_color;
 public static void main(String[] args)
 {
  Cloth116 c2 = new Cloth116();
  c2.cl_size = 'm';
  c2.cl_color = "violet";
  System.out.println("cloth cost = "+cl_cost);
  System.out.println("cloth size = " +c2.cl_size);
  System.out.println("cloth color = "+c2.cl_color);
 }
}