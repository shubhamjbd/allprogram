package control_statements;

public class Else_If_Study {

	public static void main(String[] args) 
	{
//		if my marks are
//		
//		
//		40-60-->2nd class
//		>60-<75--> 1st class
//		>=75--->Dist
		
		int marks=60;
		
		if (marks>40 & marks<60 )
		{
			System.out.println("I am in 2nd class");
		}
		
		else if (marks>=60 & marks<75) 
		{
			System.out.println("I am in 1st class");
		}
		
		else if (marks>=75)
		{
			System.out.println("I am in Dist");
		}
		
		else 
		{
			System.out.println("I am failed");
		}
		

	}

}
