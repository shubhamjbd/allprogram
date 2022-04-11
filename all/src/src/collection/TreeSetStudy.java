package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>();
		
		ts.add(4);
		ts.add(2);
		ts.add(1);
		ts.add(1);
		ts.add(3);
		
		System.out.println(ts);
		System.out.println("Polled element is "+ts.pollFirst());

		for(int i:ts) {
			System.out.println(i);
		}
		
		
		Iterator<Integer> it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
