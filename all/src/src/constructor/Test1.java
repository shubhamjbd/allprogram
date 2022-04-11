package constructor;

public class Test1 {

	public static void main(String[] args) 
	{
		Varable_call vc= new Varable_call();// created object of another class
		
		System.out.println("Value of a is "+vc.a);// calling non static variable from another class
		
		System.out.println("Value of b is "+Varable_call.b);// calling static variable form another class
		
	}

}
