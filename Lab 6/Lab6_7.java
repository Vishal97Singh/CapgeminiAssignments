package lab2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6_7 {
	public boolean validateUid(String uid) {
		    String regx = "[a-zA-Z]{8,}\\_job";
		    
		    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher(uid);
		    return matcher.find();
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
