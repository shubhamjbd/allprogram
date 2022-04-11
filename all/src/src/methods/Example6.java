package methods;

public class Example6 {

	
	
	public static void main(String[] args)
	{
		Example6 e= new Example6();// object creation
		addition();// calling static method
		e.studentInfo();// calling non static method
		e.studentInfo();// calling method without parameter
		e.studentInfo1("Pune", 11, 'B', 33.3f);// calling method with parameter
		e.studentInfo1("MH", 12,'A',999.99f);
		e.studentInfo1("Katraj", 8, 'C', 11.11f);
		addition1(100, 200,11);
		addition1(400, 300,11);
		addition1(500, 500,10);
		addition1(10, 20, 30);
		
		

	}

	public static void addition()// method -without parameter
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);
	}
	
	public static void addition(int a)
	{
		
	}
	
	public static void addition1(int a, int b,int c )
	{
		int sum=a+b+c;
		System.out.println("Sum is "+sum);
		
	}
	
	public void studentInfo()// non- parameterised method
	{
		//name, weight, grade, roll_No
		
//		String name;// step1.variable declaration
//		name="Velocity";// step2. Variable initialization
	
		String name="Velocity";//1,2
		int RollNum=10;
		char grade='A';
		float weight=77.77f;
		
		System.out.println("=================================");
		System.out.println("Student name is "+name);
		System.out.println("Student roll num is "+RollNum);
		System.out.println("Student grade is "+grade);
		System.out.println("Student weight is "+weight);
		System.out.println("==================================");
		
		
	}
	
	
	public void studentInfo1(String name,int RollNum, char Grade,float weight)
	
	{
		
		//Method with parameter
		System.out.println("==============================");
		System.out.println("Student name is "+name);
		System.out.println("Student Roll_Num is "+RollNum);
		System.out.println("Student grade is "+Grade);
		System.out.println("Student weight is "+weight);
		System.out.println("===============================");
		
	}
	
	
}
