class Laptop113
{
 static String lptp_brand = "HP";
 String lptp_name;
 long lptp_cost;
 public static void main(String[] args)
 {
  Laptop113 l1 = new Laptop113();
  l1.lptp_name = "elitebook";
  l1.lptp_cost = 50000;
  System.out.println("laptop brand = "+lptp_brand);
  System.out.println("laptop cost = "+ l1.lptp_cost);
  System.out.println("laptop name = "+l1.lptp_name);
 }
}