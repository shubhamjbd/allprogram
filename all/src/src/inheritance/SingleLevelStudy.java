package inheritance;

public class SingleLevelStudy {

	public static void main(String[] args)
	{
//		Mother m = new Mother();// creating object of mother class
//		m.look();
//		m.money();
		
		Daughter d= new Daughter();// creating object of Daughter class
		d.mobile();
		d.money();// calling super class property using child class object
		d.look();// calling super class property using child class object

		Mother.nature();// calling static method from mother class
		
		Daughter.scooty();//calling static method from daughter class
		Daughter.nature();//using subclass name to call static method from super class
		
		
	}

}
