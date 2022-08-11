class Nonstatic

{
 void add()
 {
  int a= 9;
  int ans = a*3;
  System.out.println(ans);
 }
 public static void main(String[] args)
 {
  new Nonstatic().add();
 }
}