package lab2;

import java.awt.List;
import java.util.ArrayList;

public class Lab3_2 {
	
	public static String[] getSorted(String[] s) {
		int size=s.length;
		String []s1=new String[size];
	
		for(int i=0;i<size;i++) {
			if(i<(size+1)/2) {
				s1[i]=s[i].toUpperCase();		
				}
			else {
				s1[i]=s[i].toLowerCase();
			}
		}
		return s1;	
	 }

	public static void main(String args[]) {
		String []s= {"vishal","vikas","lokesh","Ravi","Saksham","Vishak","Hello","Hi"};
		String []sp=getSorted(s);
		for(int i=0;i<sp.length;i++) {
			System.out.println(sp[i]);
			}
	}

}
