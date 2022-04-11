package casting;

public class CastTest {

	public static void main(String[] args) 
	{
	//implicit casting lower--> higher
		
		int a=10;
		
		System.out.println("Value of a is "+a);
		
		double b=a;
		System.out.println("Value of b is "+b);
		
		
		//explicit casting higher--> lower
		
		double c=10.1234;
		System.out.println("value of c is "+c);
		
		int d=(int) c;
		System.out.println("Value of d is "+d);
		
		
	}

}
