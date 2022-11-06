package src.abstract_study;

public abstract  class Sample
{

	public static void main(String[] args) {
		
		//Sample s= new Sample();--> we cant create object of abstract class
	test4();
}
	public void test1()
	{
		System.out.println("This is complete method ");
		System.out.println("This ");
		System.out.println("T ");
		
	
	}
	
	public void test2()
	{
		//method have body
		// even if body is empty, this is complete method
	}
	
	public abstract void test3();// this is incomplete method called as abstract method
	
	public static void test4() {
		System.out.println("This is static method with body");
	}
	public abstract  void test5();
	
}
