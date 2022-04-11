package methods;

public class Math_Operation {

	public void addition()
	{
//		int a;//1. variable declaration
//		a=20;// 2. variable initialization
		int a=10;//1,2
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public static void main(String[] args) 
	{
		Math_Operation m= new Math_Operation();// created object
		m.addition();// calling non static method addition form same class
		subtraction();// calling static method subtraction form same class
		subtraction();
		subtraction();
		
	}
	
	public static void subtraction()
	{
		int a=20;
		int b=10;
		int sub=a-b;
		System.out.println("Subtraction is "+sub);
		
	}
	
	

}
