package myDataTypes.entertainment;

public class Movie 
{
	String moviename;
	String typeofmovie;
	double duration;
	String language;
	int year;
	
	public void start()
	{
		
	}
	public void end()
	{
		
	}
	
	public Movie(String movie,String type,double time,String lang,int year)
	{
	
		this.moviename=movie;
		this.typeofmovie=type;
		this.duration=time;
		this.language=lang;
		this.year=year;
	}
	
	public void display()
	{
		System.out.println("Movie Name: "+moviename);
		System.out.println("Type of Movie: "+typeofmovie);
		System.out.println("Duration of movie in minutes: "+duration);
		System.out.println("Movie Language: "+language);
		System.out.println("Movie Release Year: "+year);
		System.out.println();
	}
}
