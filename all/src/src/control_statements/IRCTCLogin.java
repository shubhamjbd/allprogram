package control_statements;

public class IRCTCLogin {

	public static void main(String[] args) {
		//username
		//password
		//captcha
		
		String Username="Velocity";
		String Password="V123";
		int captcha=1234;
		
		if(Username=="Velocity")
		{
			System.out.println("Enter password");
			if (Password=="V123")
			{
				System.out.println("Enter Captcha");
				
				if(captcha==1234)
				{
					System.out.println("Login success");
				}
				else 
				{
					System.out.println("Incorrect captcha");
				}
			}
			
			else 
			{
				System.out.println("Incorrect Password");
			}
		}

		else
		{
		System.out.println("Incorrect username");	
		}
	}

}
