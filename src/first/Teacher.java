package first;

public class Teacher extends Student {
	
	
	private String Experience;
	
	private String Subject;
	
	public void setTeacherDeatils
	(String name,String city,int Birthyear,String course,String college,String Experience,String Subject )
	{
		this.Experience=Experience;
		this.Subject=Subject;
		this.setStudentDetails(name, city, Birthyear, course, college);
		
	}
	
	public void printTeacherDetails()
	{
		
		System.out.println("this Experience " +Experience);
	
		System.out.println("this Subject " +Subject);
		this.printDetails();//alreday it is from parent class
	}
	
}



