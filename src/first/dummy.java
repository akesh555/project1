package first;

import java.util.Scanner;

public class dummy {

	public static void main(String args[])
	{
	
	Scanner sc=new Scanner(System.in);
	{
		System.out.println("enter name: ");
		String num=sc.next();
       
      
      System.out.println("nameis "+num); 
      
      
	}
	
	Scanner sc1=new Scanner(System.in);
	{
		System.out.println("enter city: ");
		String num1=sc1.next();
       
      
      System.out.println("nameis "+num1); 
      
	}
	
	Scanner sc2=new Scanner(System.in);
	{
		System.out.println("enter age: ");
		
		 int birth=sc2.nextInt();
		 birth=2024-birth;
		 System.out.println("brithyear :"+birth); 
      
	}
}
}