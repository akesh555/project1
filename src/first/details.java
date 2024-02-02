package first;
import java.util.*;
import java.util.Scanner;
public class details {

	
	public static void main(String args[])
	
	{
		User u =new User();
		{
			u.name="kkk";
			u.age=23;
			u.city="gggg";
			u.printDetails();
			
		
		}
		User u2 =new User();
		{
			u2.name="khh";
			u2.age=26;
			u2.city="gggg";
			u2.printDetails();
			
		
		}
	}
	
	//calculator for scanner//
	
	Scanner sc=new Scanner(System.in);
			{
		       String num=sc.next();
		       
		      
		      System.out.println("nameis "+num); 
		
			}
	
}
