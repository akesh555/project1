package first;

import java.util.*;
import java.util.Scanner;
public class User {
	
	String name;
	int age;
	String city;
	static String race="human";
	
	public void printDetails()
	{
		System.out.println("this name " +name);
		System.out.println("this age " +age);
		System.out.println("this city " +city);
		System.out.println("this race " +race);
	}

}
