package first;

public class Inhersample
{

	private String name;
	private String city;
	private int Birthyear;

	
	/*public Inhersample(String name,String city,int Birthyear)
	
	//{
		this.name=name;
		this.city=city;
		this.Birthyear=Birthyear;	
	}*/
	
	public void setdetails(String name,String city,int Birthyear)
	{
		this.name=name;
		this.city=city;
		this.Birthyear=Birthyear;
	}
	
	public void printDetails()
	{
		System.out.println("this name " +name);
		System.out.println("enter age:"+(2024 -Birthyear));
		System.out.println("this city " +city);
		
	}
	public void calculatorAge(int year)
	
	{
		int age=year - Birthyear;
		System.out.println("the age is :"+age);
		//System.out.println("enter age:"+(year -Birthyear));
	      
	}
	public void calculatorAge(int year,String message)
	
	{
		int age=year - Birthyear;
		System.out.println(" "+age + " "+message);
	
		
		//System.out.println("enter age:"+(year -Birthyear));
	      
	}
	
}
