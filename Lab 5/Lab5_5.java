package lab2;
import java.util.*;

class AgeException extends Exception {
	public AgeException(String s) {
		super(s);
	}
}

public class Lab5_5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		try {
			if(age<=15)
				throw new AgeException("Fine");
			else
				System.out.println("Age : "+age);
		}catch(AgeException e) {
			System.out.println("Age of a person should be above 15.");
		}
	}

}
