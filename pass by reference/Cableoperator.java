class Discovery
{
 void watch()
 {
  System.out.println("channel is playing");
 }
}
class Cableoperator
{
 public static void main(String[] args)
 {
  Discovery d2 = new Discovery();
  User1 u1 = new User1();
  User2 u2 = new User2();
  u1.tvon(d2);
  u2.tvon(d2);
 }
}
class User1
{
 void tvon(Discovery conn)
 {
  conn.watch();
 }
}
class User2
{
 void tvon(Discovery conn)
 {
  conn.watch();
 }
}