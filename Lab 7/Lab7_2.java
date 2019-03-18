package lab2;

import java.util.*;

public class Lab7_2 {
	public Map countCharacter(char[] ch) {
	
		Map<Character,Integer> mp=new TreeMap<Character,Integer>();
		for(int i=0;i<ch.length;i++) {
			if(mp.containsKey(ch[i])) {
				int p=mp.get(ch[i]);
				mp.put(ch[i], p+1);
			}
			else {
				mp.put(ch[i], 1);
			}
		}
		
		
		return mp;
    
}
		
	public static void main(String ar[]) {
		Lab7_2 l72=new Lab7_2();
		char []ch= {'p','a','p','a','A'};
		System.out.println(l72.countCharacter(ch));
		
	}

}
