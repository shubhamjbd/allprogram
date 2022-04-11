package aray_Study;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		
//		String name1="Velocity";
//		String name2="Ctroporate";
//		String name3="Training";
//		String name4="Center";
//		
//		int Salary=50000;
//		
//		//1. declaration
//		
//		String institute[]= new String[5];
//		
//		//2.initialization
//		institute[0]="Velocity";
//	//	institute[1]="Corporate";
//		institute[2]="Training";
//		institute[3]="Center";
//		//institute[7]="Pune";
//		
//		
//		//3.usages
//		
//		System.out.println(institute[0]);
//		System.out.println(institute[1]);
//		System.out.println(institute[2]);
//		System.out.println(institute[3]);
//		
//		
//		System.out.println("==================");
//		for(int i=0;i<=3;i++)
//		{
//			System.out.println(institute[i]);
//		}
//		
		
		//1. declaration 
		char grade[]= new char[8];
		
		//2. initialization 
		
		grade[0]='B';
		grade[1]='E';
		grade[2]='F';
		grade[3]='A';
		grade[4]='C';
		grade[5]='D';
		
		//3.usages
//		System.out.println(grade[0]);
//		System.out.println(grade[1]);
		
		
//		for(int i=0;i<=5;i++)
//		{
//			System.out.println(grade[i]);
//		}
		
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		
		Arrays.sort(grade);
		
		System.out.println("==============After Sorting=================");
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}
		
		
		
		System.out.println("==================Descending Order========================");
	
		for(int i=grade.length-1;i>=0;i--)
		{
			System.out.println(grade[i]);
		}
	
	}
	
	
	
	
	

}
