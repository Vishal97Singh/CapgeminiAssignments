package lab2;

import java.util.*;

public class Lab7_3 {
	public Map getSquare(int[] a) {
	
		Map<Integer,Integer> mp=new TreeMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
				mp.put(a[i], a[i]*a[i]);	
		}
		return mp;    
}
		
	public static void main(String ar[]) {
		Lab7_3 l73=new Lab7_3();
		int []a= {2,3,5,7,9};
		System.out.println(l73.getSquare(a));
		
	}

}
