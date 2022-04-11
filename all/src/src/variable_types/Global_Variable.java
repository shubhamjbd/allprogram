package variable_types;

public class Global_Variable {

	int a=10;//global variable -non static
	static int b=20;//global static variable
	String name="Velocity";
	public static void main(String[] args) 
	{
		System.out.println("value of b is "+b);// calling global static variable
		
		Global_Variable gv= new Global_Variable();// created object of a class
		System.out.println("value of a is "+gv.a);// calling global non static variable
		
		gv.test();// calling non static method
		test1();// calling static method
		
	}
	
	
	public void test()
	{
		System.out.println("My name is "+name);
		int c=10;// local variable
		int sum=c+a;// using global variable adding in local
		int sum1=c+b;// 
		System.out.println("Addition is "+sum);
		//int sum1=a+d;--> we cant use local(d) variable from another method
	}
	
	public static void test1()
	{
	//	System.out.println("My name is "+name);
		int c=30;// local variable
		int d=40;// local variable
		int sub=d-b;// using global static variable
		//int sub1=d-a;-->we cant call non static variable in static blocks
		System.out.println("Substraction is "+sub);
	}

}
