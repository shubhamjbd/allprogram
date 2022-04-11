package casting;

public class Son extends Father {

	public static void main(String[] args) 
	{
		//creating object of subclass and giving superclass reference
		
		Father f= new Father();// creating object of father
		f.money();
		
		Son s= new Son();// creating object of Son
		s.money();
		s.bike();// calling own property
		
		Father f1=new Son();// upcasting
		f1.money();
		//f1.bike();//we cant call the method which is not common

	}
	
	public void money()// overridded
	{
		System.out.println("Sons money 1L");
	}

	public void bike()// sons own property 
	{
		System.out.println("Sons bike pulser");
	}
}
