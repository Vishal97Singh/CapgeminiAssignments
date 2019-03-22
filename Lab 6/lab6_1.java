package lab2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class lab6_1 {
	static int a[];
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
	
		int sum=0;
		StringTokenizer st=new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			Integer x=0;
			try {
	        x=Integer.parseInt(st.nextToken());
	    	
			}catch(NumberFormatException e) {
				//System.out.println(e);
			}
	
			if(x instanceof Integer) {
				sum+=x;
			}
		}
		System.out.println("Sum : "+sum);	
	}
}
