package variable_types;

public class Test {
	
	int a=90;// global non static variable
	static int b=80;//// global static variable
	public static void main(String[] args) 
	{
		Test t= new Test();// created object of test class
		int sum=10+t.a;
		System.out.println("Sum is "+sum);
		int sub=100-b;
		System.out.println("Sub is "+sub);
		int sub1=b-t.a;
		System.out.println("sub1 is "+sub1);

	}

}
