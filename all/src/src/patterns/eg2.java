package patterns;

public class eg2 {

	public static void main(String[] args) {
		//5*5
		//row-->outer, col-->inner, row-->5, Col-->5
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		
		for(int i=1;i<=5;i++)//1
		{
			
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
