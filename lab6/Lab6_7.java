package lab6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author Vishal Singh
 *
 */
public class Lab6_7 {
	public boolean validateUid(String uid) {
		    String regx = "[a-z A-Z]{8,}\\_job";
		    
		    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(uid);
		    return matcher.matches();
	}
	public static void main(String st[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String uid=sc.nextLine();
		sc.close();
		Lab6_7 l=new Lab6_7();
		System.out.println(l.validateUid(uid));
	}

}
