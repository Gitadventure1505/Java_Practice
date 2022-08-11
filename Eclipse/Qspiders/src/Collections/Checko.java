package Collections;
import java.util.ArrayList;
public class Checko 
{
public static void main(String[] args)
{
 ArrayList l1 = new ArrayList();
 l1.add(5);
 l1.add("iugk");
 if(l1.contains("iugk"))
 {
	 System.out.println("testcase is pass");
 }
 else
 {
	 System.out.println("testcase fails");
 }
}
}
