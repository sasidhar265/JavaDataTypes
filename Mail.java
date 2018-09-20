package myDataTypes.social;

public class Mail 
{	
	String mailid;
	String typeofdomain;
	String username;

	public int recievingandsendingmails()
	{
		return 0;
	}
	
	public void networkstatus()
	{
		
	}
	
	public Mail(String mail,String domain,String name)
	{
		this.mailid=mail;
		this.typeofdomain=domain;
		this.username=name;
	}
	
	public void display()
	{
		System.out.println("Mail_id: "+mailid);
		System.out.println("Type of Domain: "+typeofdomain);
		System.out.println("Username: "+username);
		System.out.println();
	}
}
