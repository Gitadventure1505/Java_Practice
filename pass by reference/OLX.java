class Seller
{
 void bike()
 { 
  System.out.println("black pulsar");
 }
}
class Olx
{
 public static void main(String[] args)
 {
  Seller s1 = new Seller();
  Buyer1 b1 = new Buyer1();
  Buyer2 b2 = new Buyer2();
  b1.view(s1);
  b2.view(s1);

 }
}
class Buyer1
{
 void view(Seller detail)
 {
  detail.bike();
 }
}
class Buyer2
{
 void view(Seller detail)

 {
  detail.bike();
 }
}