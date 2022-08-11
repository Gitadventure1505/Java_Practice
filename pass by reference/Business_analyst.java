class Customer
{
 void requirement()
  { 
   System.out.println("username should accept only alphabets");
  }
}
class Business_analyst
{
 public static void main(String[] args)
 {
  Customer c1 = new Customer();
  Developer d1 = new Developer();
  d1.requirement(c1);
  Testengineer t1 = new Testengineer();
  t1.requirement(c1);
 }
}
class Developer
{
 void requirement(Customer srs)
 {
  srs.requirement();
 }
}
class Testengineer
{
 void requirement(Customer srs)
 {
  srs.requirement();
 }
}