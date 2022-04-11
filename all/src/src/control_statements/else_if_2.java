package control_statements;

public class else_if_2 {

	public static void main(String[] args)
	{
		else_if_2 e= new else_if_2();
		e.testGrade();

	
	}
	
	public void testGrade()
	{
//		if my grade is
//		A--> %>=75
//		B--> % >=60-<=75
//		C--> %>40-<60
//		D--> fail
		
		char Grade='C';
		
		if(Grade=='A')
		{
			System.out.println("Your marks are >=75");
		}
		
		else if (Grade=='B') 
		{
			System.out.println("Your marks are >=60 to <=75");
		}
		
		else if (Grade=='C') 
		{
			System.out.println("Your marks are >40-<60");
		}
		
		else 
		{
			System.out.println("You are failed");
		}
	}

}
