class Demo10
{
 double y = 8;
 float z;
}

class Dumtaka3 extends Demo10
{
 int r;
}

class Main171
{
 public static void main(String[] args)
 {
  Demo10 d1 = new Dumtaka3();
  System.out.println(d1.y);
  System.out.println(d1.z);
 
  Dumtaka3 d3 = (Dumtaka3) d1;
  System.out.println(d3.y);
  System.out.println(d3.z);
  System.out.println(d3.r);
 }
}
