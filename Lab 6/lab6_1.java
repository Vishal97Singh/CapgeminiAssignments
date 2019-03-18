package lab2;

import java.util.StringTokenizer;

public class lab6_1 {
	public static void main(String args[]) {
		String s="12 34 54 56 32";
		int sum=0;
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
			//int i=Integer.parseInt(st.nextToken());
			//sum+=i;
			
		}
		//System.out.println(sum);
		
	}
	


}
