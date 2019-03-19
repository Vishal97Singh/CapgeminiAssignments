package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class Lab6_5 {
	 public boolean checkPositive(String str) {
		 char []ch=str.toCharArray();
		 Arrays.sort(ch);
		 String s=new String(ch);
		 if(str.equalsIgnoreCase(s)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	public static void main(String str[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String string=sc.nextLine();
		sc.close();
		Lab6_5 l=new Lab6_5();
		System.out.println(l.checkPositive(string));	
	}
}
