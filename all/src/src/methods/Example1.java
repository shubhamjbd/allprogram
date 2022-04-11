package methods;

public class Example1 {

	public static void main(String[] args)

	{
		System.out.println("Running main method");
		// calling static regular method
		//syntax: methodname();--> to call static regular method in same class
		test1();
		test1();
		test1();
		demo();
		
		System.out.println("Ending main method");
	}

	//public static void test1();// method declaration// incomplete method
	// because this method dont have body
	
	public static void test1() // complete method//method definition
	{
		// this is method body
		System.out.println("This is static regular test1 method");
		
	}
	
	public static void demo()
	{
		System.out.println("Hi this is Demo Static method");
	}
	
	public static void test2()
	{
	
		System.out.println("This is static regular test2 method");
	}
	
	public static void test3()
	{
		
	}
	
	
	
}
