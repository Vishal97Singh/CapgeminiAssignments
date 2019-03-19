package lab2;

import java.util.StringTokenizer;

public class lab6_1 {
	public static void main(String args[]) {
		String s="12 34 54 56 32";
		int sum=0;
		StringTokenizer st=new StringTokenizer(s," ");
	
		while(st.hasMoreTokens()) {
			int x=Integer.parseInt(st.nextToken());
			System.out.println(x);
			sum+=x;
		
			
		}
		System.out.println("Sum : "+sum);
		
	}
	


}
