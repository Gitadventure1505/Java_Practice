class Qspiders
{
 void Teaching()
 {
  System.out.println("Faculty giving presentatiom");
 }
}

class Java extends Qspiders
{
 void Teaching()
 {
  System.out.println("shankar sir presentation");
 }
}

class Sql extends Qspiders
{
 void Teaching()
 {
  System.out.println("Ravi sir presentation");
 }
}

class Manual extends Qspiders
{
 void Teaching()
 {
  System.out.println("Keerthi sir presentation");
 }
}

class Mobile
{
 static void pdf(Qspiders q)
 {
  q.Teaching();
 }
}

class Main3
{
 public static void main(String[] args)
 {
  Java j = new Java();
  Sql s = new Sql();
  Manual m = new Manual();

  Mobile.pdf(j);
  Mobile.pdf(s);
  Mobile.pdf(m);
 }
}