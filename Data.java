package mydata;
import myDataTypes.employee.Employee;
import myDataTypes.entertainment.*;
import myDataTypes.social.*;
public class Data 
{
	public static void main(String[] args) 
	{

		Employee e=new Employee("DT-123456","Sasidhar","9494102065","nspsasidhar@gmail.com");
		e.display();
		
		IplTicket it=new IplTicket("9348",2250.0,"Hyderabad v/s Banglore","Balcony");
		it.display();
		
		Movie m=new Movie("Life of pie","Survival drama film",180.0,"English",2012);
		m.display();
		
		MovieTicket mt=new MovieTicket("SD-123456","MEN IN BLACK 3","10/09/2018","Sasi picture palace",
									   "18:30",'B', 5, 150.00);
		mt.display();
		
		Mail em=new Mail("nspsasidhar@gmail.com","gmail","nspsasidhar");
		em.display();
		
		Whatsapp wg=new Whatsapp("Thunder Buddies",25,"sasidhar",94941020);
		wg.display();
	}
}
