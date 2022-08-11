package collecton;

import java.util.ArrayList;

public class Rough1 {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();
		
		
		System.out.println(l.add(7)); 
		System.out.println(l.add("hello")); 
		System.out.println(l.add('g')); 
		System.out.println(l.add(true)); 
		System.out.println(l.add(90.86)); 
		System.out.println(l.add(null)); 
		System.out.println(l.add("ytdtyd")); 
		System.out.println(l.add(90.97)); 
		System.out.println(l.add(9)); 
		System.out.println(l.add('u')); 
		System.out.println(l.add("yty"));
	//	System.out.println(l.add(1/0)); 
		
		System.out.println(l);
		
		
		
		
		
		
		System.out.println(l.size());

		ArrayList clo = (ArrayList) l.clone();
		
		System.out.println(clo);
		System.out.println(l.containsAll(clo));
		

	}

}
