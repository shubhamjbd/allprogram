package inheritance;

public class Son extends Mother
{

	public static void main(String[] args)
	{
		Son s= new Son();
		s.laptop();
		s.look();// calling super class property using sub class object
		s.money();// calling super class property using sub class object
		nature();// calling super class static property in sub class

	}
	
	public void laptop()
	{
		System.out.println("Sons laptop");
	}

}
