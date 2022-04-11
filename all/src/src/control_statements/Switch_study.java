package control_statements;

public class Switch_study {

	public static void main(String[] args) {
		
		//if my Year is
//		1: I am in 1st Year of engg 
//		2: I am in 2nd Year of engg
//		3: I am in 3rd Year of engg
//		4: I am in 4th Year of engg
//      Please Enter Valid value between 1-4--> Default
		
		int Year=3;
		
		switch (Year) 
		{
		case 1: System.out.println("I am in 1st Year of engg");
		break;
		
		case 2: System.out.println("I am in 2nd Year of engg");
		break;
		
		case 3: System.out.println("I am in 3rd Year of engg");
		break;
		
		case 4: System.out.println("I am in 4th Year of engg");
		break;

		default: System.out.println("Please Enter Valid value between 1-4");
		break;
		}
	
	}

}
