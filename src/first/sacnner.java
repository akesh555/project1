package first;

import java.util.Scanner;

public class sacnner {

	String name;
	int Birthyear;
	String city;
	
	public void getDetails()
	
	{
		
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter name: ");
			name=sc.next();
			
			System.out.println("enter birth: ");
			Birthyear=sc.nextInt();
			
			System.out.println("enter city: ");
			city=sc.next();
	     
		}
		
	}
		public void printDeatils()
		
		{
			System.out.println("enter name: "+name);
			System.out.println("enter city: "+city);
			//System.out.println("enter age:"+(2024 -Birthyear));
		}
		
		public int calculatorAge(int year)
		
		{
			int age=year - Birthyear;
			return  age;
			//System.out.println("enter age:"+(year -Birthyear));
		      
		}
		
		
		
	}
	
	

