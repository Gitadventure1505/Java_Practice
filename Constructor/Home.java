class Home
{
 long hm_cost;
 String hm_name;
 String hm_color;
 Home(long a, String b, String c)
 {
  hm_cost = a;
  hm_name = b;
  hm_color = c;

 }
 public static void main(String[] args)
 {
  Home h1 = new Home(1000000,"RAM BHAVAN","black");
  System.out.println("home cost = "+h1.hm_cost);
  System.out.println("home name = "+h1.hm_name);
  System.out.println("home color = "+h1.hm_color);
 }
}