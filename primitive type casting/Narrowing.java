class Narrowing
{
 public static void main(String[] args)
 {
  int a = (int)12.888;// double to int
  System.out.println(a);

  long b = (long)18.7f; // float to long
  System.out.println(b);

  float c = (float) 12.22;// double to float
  System.out.println(c);

 }
}