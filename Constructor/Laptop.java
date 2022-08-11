class Laptop
{
 long lptp_cost;
 String lptp_name;
 String lptp_brand;
 Laptop(long a, String b, String c)
 {
  lptp_cost = a;
  lptp_name = b;
  lptp_brand = c;
 }
 public static void main(String[] args)
 {
  Laptop l1 = new Laptop(50000,"elitebook","hp");
  System.out.println("laptop cost = "+l1.lptp_cost);
  System.out.println("laptop name = "+l1.lptp_name);
  System.out.println("laptop brand ="+l1.lptp_brand);
 }
}