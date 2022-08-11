package PolyMorphism;

class Qspider
{
 void Teaching()
 {
  System.out.println("Faculty giving presentatiom");
 }
}

class Java extends Qspider
{
 void Teaching()
 {
  System.out.println("shankar sir presentation");
 }
}

class Sql extends Qspider
{
 void Teaching()
 {
  System.out.println("Ravi sir presentation");
 }
}

class Manual extends Qspider
{
 void Teaching()
 {
  System.out.println("Keerthi sir presentation");
 }
}

class Mobile
{
 static void pdf(Qspider q)
 {
  q.Teaching();
 }
}

class Qspiders
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