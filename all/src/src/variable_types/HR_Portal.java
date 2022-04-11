package variable_types;

public class HR_Portal {

	public static void main(String[] args) 
	{
		Employee SachinT= new Employee();// created object of Employee
		
		SachinT.Emp_Name="Sachin Tendulkar";
		SachinT.Emp_code=10;
		SachinT.Emp_grade='A';
		SachinT.Emp_Sal=1919191.11919f;
		
		Employee Rahul= new Employee();
		Rahul.Emp_Name="Rahul D";
		Rahul.Emp_code=11;
		Rahul.Emp_grade='B';
		Rahul.Emp_Sal=1234.12f;
		
		SachinT.emp_info();
		Rahul.emp_info();
		
		

	}

}
