package collection;


import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) {
		
		LinkedHashSet lh= new LinkedHashSet<>();
		
		lh.add("Velocity");
		lh.add("Velocity");
		lh.add(100);
		lh.add(null);
		lh.add(null);
		lh.add("test");
		
		System.out.println(lh);
		

	}

}
