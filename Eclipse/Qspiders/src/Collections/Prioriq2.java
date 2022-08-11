package Collections;
import java.util.PriorityQueue;

public class Prioriq2
{
 public static void main(String[] args)
 {
	 PriorityQueue p = new PriorityQueue();
	 p.add(78);
	 p.add(99);
	 p.add(66);
	 p.add(89);
	 p.add(63);
	 p.add(9);
	 System.out.println(p);
	 System.out.println("poll --> " +p.poll());
	 System.out.println(p);
	 System.out.println("peek --> "+p.peek());
	 System.out.println(p);
	 
 }
	
}
