class Youtube_v1
{
 void home()
 {
  System.out.println("Videos from subscribed channels");
 }
}
class Youtube_v2 extends Youtube_v1
{
 void home()
 {
  System.out.println("videos from channel you stalk");
  super.home();
 }
}
class Youtube
{
 public static void main(String[] args)
 {
  Youtube_v2 u1 = new Youtube_v2();
  u1.home();
 }
}