package Assignments;

interface Qspiders
{
void teaching();	
}

class Java implements Qspiders
{
 public void teaching()
 {
	 System.out.println("Shankar sir");
 }
}

class Manual implements Qspiders
{
 public void teaching()
 {
	 System.out.println("keerthi sir");
 }
}

class Sql implements Qspiders
{
 public void teaching()
 {
	 System.out.println("ravi");
 }
}

class Stimulator3
{
 static void anscim(Qspiders q)
 {
	 q.teaching();
 }
}
public class Mainclass3
{
 public static void main(String[] args) 
 {
  Java j = new Java();
  Manual m = new Manual();
  Sql s = new Sql();
  
  Stimulator3.anscim(j);
  Stimulator3.anscim(m);
  Stimulator3.anscim(s);
		  
		  
 }
}
