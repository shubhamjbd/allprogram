package control_statements;

public class Nested_If_Else_Study {

	//If username is correct then please enter password, if your password is correct then "Login successful" welcome.
			//If Password is wrong then please check your password, else incorrect username.
	public static void main(String[] args) 
	{
		String UserName="Velocity";
		String Password="Velocity@123";
		
		if (UserName=="Velocitye")//
		{
			System.out.println("UserName is correct, Please enter password");
			
			if (Password=="Velocity@1234")
			{
				System.out.println("Correct password, Login Success");
			}
		
			else 
			{
				System.out.println("Please check your password");
			}
		}
		
		else 
		{
			System.out.println("Incorrect username");
		}

	}

}
