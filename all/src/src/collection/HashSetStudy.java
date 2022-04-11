package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
	
		HashSet hs= new HashSet<>();
		
		hs.add(100);
		hs.add("Pune");
		hs.add(null);
		hs.add(null);
		hs.add(100);
		hs.add('A');
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Pune"));
		System.out.println(hs.size());
		
		
//		for(int i=0;i<=hs.size()-1;i++)
//		{
//			System.out.println(hs.ge);
//		}
		
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
		Iterator it = hs.iterator();
		
			
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

		
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
	}

}
