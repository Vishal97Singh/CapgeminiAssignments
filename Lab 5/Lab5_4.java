package lab2;

import java.util.Scanner;

public class Lab5_4 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first name");
	String fname=sc.nextLine();
	System.out.println("Enter last name");
	String lname=sc.nextLine();
	
	try {
		//String fname="Vishal";
		//String lname="Singh";
	if(lname.isEmpty() || fname.isEmpty()) {
		throw new NullPointerException();
	   }
	else
		System.out.println(fname+" "+lname);
	}catch(NullPointerException e) {
		System.out.println("Name field should not be empty");
	}
	
  }
}
