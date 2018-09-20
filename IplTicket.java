package myDataTypes.entertainment;

public class IplTicket 
{
	String ticketnumber;
	double cost;
	String match;
	String typeofticket;
	
	
	public void matchstart()
	{
		
	}	
	
	public void matchend()
	{
		
	}
		
	public IplTicket(String no,double cost,String match,String tickettype)
	{
		
		this.ticketnumber=no;
		this.cost=cost;
		this.match=match;
		this.typeofticket=tickettype;
	}
	
	public void display()
	{
		System.out.println("IPL Ticket Number: "+ticketnumber);
		System.out.println("IPL Ticket Cost: "+cost);
		System.out.println("IPL Match: "+match);
		System.out.println("Type of Ticket: "+typeofticket);
		System.out.println();
	}

}
