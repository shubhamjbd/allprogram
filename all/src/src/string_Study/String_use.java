package string_Study;

public class String_use {

	public static void main(String[] args) {
		
		//String a="Pune";
		int a1=10;
	//	String_use s= new String_use();
		
		String m="Velocity";//without using new keyword
		String m1="Velocity";
				
		String n= new String("Velocity");//with using new keyword
		String n1=new String("Velocity");
		String n2=new String("Velocity Pune");
//		
//		System.out.println(m==m1);
//		System.out.println(m==n);
//		System.out.println(m.equals(n));
//		System.out.println(n.equals(n1));
		
//		System.out.println(m.length());
//		System.out.println("length is "+n2.length());
//		
		 int lengthOfn2 = n2.length();
//		System.out.println("length is "+lengthOfn2);
//		
//		System.out.println(n2.toUpperCase());
//		
//		String n23 = n2.toUpperCase();
//		
//		System.out.println(n23.toLowerCase());
		
		
		
		
		String a ="velocity";
		String b="Velocity";
		
		//System.out.println(a.equals(b));
		//System.out.println(a.equalsIgnoreCase(b));
		
//		System.out.println(a.contains("ve"));
//		System.out.println(a.contains("v"));
//		
//		
//		String ab="";
//		String cd=" ";
//		String pq="Velocity";
//		System.out.println(a.isEmpty());
//		System.out.println(ab.isEmpty());
//		System.out.println(cd.isEmpty());
//		
//		System.out.println("ab isBlank ? "+ab.isBlank());
//		System.out.println("cd isBlank ? "+cd.isBlank());
//		System.out.println("length of pq is "+pq.length());
//		
//		char output = pq.charAt(7);
//		System.out.println("charAT 7 is "+output);
		//System.out.println(pq.charAt(-1));
//		String ef=null;
//		System.out.println(ef.length());
		
//		String mn="Velocity";
//		System.out.println(mn.startsWith("Vel"));
//		System.out.println(mn.endsWith("ty"));
//		
//		String subString = mn.substring(4);
//		System.out.println("Substring is "+subString);
//		
//		System.out.println(mn.substring(2, 7));
		
		
		String p="Velocity ";
		String q="Corporate ";
		String r="Training ";
		String s="Center ";

		System.out.println(p.concat(q).concat(r).concat(s));
		
		String FinalString = p.concat(q).concat(r).concat(s);
		System.out.println("Combination of all string is--> "+FinalString);
	
		System.out.println(FinalString.indexOf('o'));
		System.out.println(FinalString.lastIndexOf('o'));
		
		System.out.println(FinalString.replace('o', 'i'));
		
		String k="NITIN";
		System.out.println(k.replace("NI", "SA"));
		
		String p1="I LOVE MY INDIA";
		
		String seperator=" ";
		
		String[] SplittedString = p1.split(seperator);
	
		for(int i=0;i<=SplittedString.length-1;i++)
		{
			System.out.println(SplittedString[i]);
		}
	
		
		String p2="GOOD_MORNING_ALL";
		String sep="_";
		
		String[] outPut = p2.split(sep);
		
		for(int i=0;i<=outPut.length-1;i++)
		{
			System.out.println(outPut[i]);
		}
		
	}

}
