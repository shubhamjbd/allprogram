package src.aray_Study;

public class MultiDimentionalArray1 {

	public static void main(String[] args) {
		
		char grade[][]= {{'a','b'},{'c','d'}};
		
		for(int i=0;i<=grade.length-1;i++)//0,1
		{
			for(int j=0;j<=grade.length-1;j++)//0,1,2
			{
				System.out.print(grade[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
