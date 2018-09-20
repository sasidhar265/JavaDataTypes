package myDataTypes.social;

public class Whatsapp 
{
	String groupname;
	int numberofgroupmembers;
	String adminname;
	long adminphonenumber;
	
	public void addressingmembers()
	{
		
	}
	public boolean interaction()
	{
		return true;
	}
	
	public Whatsapp(String name,int members,String admin,long phonenumber)
	{
		this.groupname=name;
		this.numberofgroupmembers=members;
		this.adminname=admin;
		this.adminphonenumber=phonenumber;
	}
	
	public void display()
	{
		System.out.println("WhatsApp Group Name: "+groupname);
		System.out.println("No.of participants: "+numberofgroupmembers);
		System.out.println("Name of Admin: "+adminname);
		System.out.println("Admin PhoneNumber: "+adminphonenumber);
		System.out.println();
	}
}
