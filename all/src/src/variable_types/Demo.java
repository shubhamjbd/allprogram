package variable_types;

public class Demo {

	public static void main(String[] args) 
	{	//non static variable-->Object
		//static variable-->class-name
		// calling global variable form another class
		
  Global_Variable gv1= new Global_Variable();// created object of another class
  System.out.println(gv1.a);// calling global non-static variable form another class, use object
  System.out.println(Global_Variable.b);// calling global static variable form another class, use class-name 
		
	}

}
