package constructor;

public class CS1 {
// example for default constructor
	
	// compiler will create constructor for us--> Default constructor
	
	public static void main(String[] args) 
	{
		CS1 c1= new CS1();// creating object
		c1.test1();// calling Non-Static method 

	}

	public void test1()
	{
		System.out.println("Hi this is Test1 Non-Static Method");
	}
}
