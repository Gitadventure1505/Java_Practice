class Television
{
 long tv_cost;
 String tv_brand;
 String tv_type;
 Television(long a, String b, String c)
 {
  tv_cost = a;
  tv_brand = b;
  tv_type = c;
 }
 public static void main(String[] args)
 {
  Television t1 = new Television(30000,"Sony","LED 12inch");
  System.out.println("tv price = "+t1.tv_cost);
  System.out.println("tv brand = "+t1.tv_brand);
  System.out.println("tv type = "+t1.tv_type);
 }
}