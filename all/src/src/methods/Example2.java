package methods;

public class Example2 {

	public static void main(String[] args) 
	{
		test1();// calling static method form same class
		Example3.test3();// calling static method form another class
		// syntax: classname.methodname();
		Example1.test1();// calling static method form another class
		Example1.test1();
		Example1.demo();

	}
	
	public static void test1()
	{
		System.out.println("Running static method form Ex2");
	}

}
