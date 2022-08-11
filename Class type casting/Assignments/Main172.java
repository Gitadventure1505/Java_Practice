class Sample21
{
int r;
 void co()
 {
  System.out.println("test approach");
 }
}

class Hahoha extends Sample21
{
 void disp()
 {
  System.out.println("attributes");
 }
}

class Main172
{
public static void main(String[] args)
{
 Sample21 s1  = new Hahoha();
 s1.co();
 System.out.println(s1.r);

 Hahoha h1 = (Hahoha) s1;
 h1.co();
 h1.disp();
 System.out.println(h1.r);

}}