class Mxplayer_v1
{
 void play()
 {
  System.out.println("only local  videos");
 }
}
class Mxplayer_v2 extends Mxplayer_v1
{
 void play()
 {
  System.out.println("webseries");
  super.play();
 }
}
class Mxplayer
{
 public static void main(String[] args)
 {
  Mxplayer_v2 m1 = new Mxplayer_v2();
  m1.play();
 }
}