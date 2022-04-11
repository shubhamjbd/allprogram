package patterns;

public class eg5 {
// *****
//  ****
//   ***
//    **
//     *
	public static void main(String[] args) {
		
		int space=0;// observing 1st row space
		int star=5;//observing 1st row star
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			space++;
			star--;
		}

	}

}
