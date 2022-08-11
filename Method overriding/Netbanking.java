class Netbanking_v1
{
 void transfer()
 {
  System.out.println("only for homogeneous type account");
 }
}
class Netbanking_v2 extends Netbanking_v1
{
 void transfer()
 {
  System.out.println("To all accounts");
  super.transfer();
 }
}
class Netbanking
{
 public static void main(String[] args)
 {
  Netbanking_v2 v2 = new Netbanking_v2();
  v2.transfer();
 }
}