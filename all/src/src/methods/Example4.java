package methods;

public class Example4 {

	public static void main(String[] args) 
	{
		// calling non-Static method--> Need to create object
		// creating object
		Example4 e4= new Example4();// syntax to create object-->classname objectName= new ClassName();

		//to call non static method-->Syntax--> Objectname.methodName();
		
		e4.test1();// calling non static method using object in same class
		e4.test1();
		e4.test1();
		e4.test2();
	
	}
	
	public void test1()// non static method--> because it dont have static keyword
	{
		System.out.println("Hi this is Non-Static test1 method is running");
	}
	
	public void test2()
	{
		System.out.println("Hi this is Non-Static test2 method is running");
	}

}
