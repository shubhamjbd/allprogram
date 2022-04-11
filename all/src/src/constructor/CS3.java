package constructor;

public class CS3 {
// this program is about to use of constructor to Initialize the variable
	int a;//1. variable declaration
	int b;//1. variable declaration
	
	//To initialize data member/variable
	
	public CS3() // constructor--> zero parameter
	{
		a=50;//2. Initialize the variable
		b=70;//2. Initialize the variable
		System.out.println("Constructor is running ");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
	
	public static void main(String[] args)
	
	{
		CS3 c3= new CS3();// created object
		c3.addition();// calling non-static method

	}
	
	public void addition()
	{
		int sum=a+b;
		System.out.println("Addtion is "+sum);
	}

}
