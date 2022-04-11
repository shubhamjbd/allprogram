package methods;

public class Example5 {

	public static void main(String[] args) 
	{
		Example5 e5= new Example5();// created object of a class
		e5.demo();// calling non static method form same class
		
		Example4 e9= new Example4();// created object of another class
		e9.test1();// calling non-Static method from another class

	}
	
	public void demo()
	{
		System.out.println("Hi this is non-Static demo method");
	}

}
