package myDataTypes.employee;

public class Employee 
{
	String employeeid;
	String employeename;
	String phonenumber;
	String email;
	

	public void work()
	{
		
	}
	public void updatework()
	{
		
	}
	public void remarks()
	{
		
	}
	public void currentstatus()
	{
	
	}	
	public Employee(String employeeid, String employeename, String phonenumber, String email) 
	{
		
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	
	public void display()
	{
		System.out.println("Employee_Id: "+employeeid);
		System.out.println("Employee_Name: "+employeename);
		System.out.println("Employee_PhoneNumber: "+phonenumber);
		System.out.println("Employee_Email: "+email);
		System.out.println();
	}
}

