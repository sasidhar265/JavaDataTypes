package myDataTypes.entertainment;

public class MovieTicket 
{
	String ticketnumber;
	String moviename;
	String date;
	String theater;
	String timing;
	char row;
	int seatnumber;
	double cost;
	
	public boolean validfrom()
	{
		return true;
	}
	public boolean validto()
	{
		return false;
	}
	
	public MovieTicket(String number,String name,String date,String theater,String time,
			char row, int seat,double price)
	{
		
		this.ticketnumber=number;
		this.moviename=name;
		this.date=date;
		this.theater=theater;
		this.timing=time;
		this.row=row;
		this.seatnumber=seat;
		this.cost=price;
	}
	
	public void display()
	{
		System.out.println("Movie Ticket Number: "+ticketnumber);
		System.out.println("Movie Name: "+moviename);
		System.out.println("Movie Date: "+date);
		System.out.println("Movie Theater: "+theater);
		System.out.println("Time of Show: "+timing);
		System.out.println("Row of Seat: "+row);
		System.out.println("Seat Number: "+seatnumber);
		System.out.println("Price of Ticket: "+cost);
		System.out.println();
	}
}
