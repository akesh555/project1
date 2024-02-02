package first;

public class Student extends Inhersample  {
	
	
	private String course;
	
	private String college;
	
	public void setStudentDetails(String name,String city,int Birthyear,String course,String college)
	{
		this.college=college;
		this.course=course;
		this.setdetails(name, city, Birthyear);
		
	}
	
	public void printStudentDetails()
	{
		
		System.out.println("this course " +course);
	
		System.out.println("this college " +college);
	}
	
}
