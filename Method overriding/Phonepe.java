class Phonepe_v1
{
 void transfer()
 {
  System.out.println("via mobile number");
 }
}
class   Phonepe_v2 extends Phonepe_v1
{
 void transfer()
 {
  System.out.println("via QR code scanner");
  super.transfer();
 }
}
class Phonepe
{
 public static void main(String[] args)
 {
  Phonepe_v2 v2 = new Phonepe_v2();
  v2.transfer();
 }
}