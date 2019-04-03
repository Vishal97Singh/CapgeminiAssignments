package lab4;
/**
 * @author Vishal Singh
 */

import java.util.Scanner;

public class Lab4 {
	public int getCube(int n) {
		int cube=0;
		while(n>0) {
			int p=n%10;
			cube+=(p*p*p);
			n=n/10;	
		}
		return cube;
	}
	public static void main(String s[]) {
		Lab4 l=new Lab4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		System.out.println(l.getCube(n));
	}

}
