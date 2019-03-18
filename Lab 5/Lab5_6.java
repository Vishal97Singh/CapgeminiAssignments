package lab2;
import java.util.*;

class EmployeeException extends Exception {
	public EmployeeException(String s) {
		super(s);
	}
}

public class Lab5_6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary of Employee");
		double salary=sc.nextDouble();
		try {
			if(salary<3000)
				throw new EmployeeException("Fine");
			else
				System.out.println("Salary : "+salary);
		}catch(EmployeeException e) {
			System.out.println("Salary is less than 3000.");
		}
	}

}
