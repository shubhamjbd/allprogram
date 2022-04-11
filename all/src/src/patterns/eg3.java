package patterns;

public class eg3 {
	
//	*
//	**
//	***
//	****
//	*****

	public static void main(String[] args) 
	{
		
		int star=1;// 1st row star count
		
		for(int i=1;i<=5;i++)//1,2
		{
			for(int j=1;j<=star;j++)//1,2
			{
				System.out.print("*");
			}
			
			System.out.println();
			star++;
		}
		

	}

}
