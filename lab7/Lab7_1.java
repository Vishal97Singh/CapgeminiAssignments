package lab7;

import java.util.*;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Lab7_1 {
	public List getValues(HashMap<String,String> h){
		Set<String> s=h.keySet();
		List l=new ArrayList();
		for(String s2:s) {
			l.add(h.get(s2));
		}
			/*TreeMap<String,String> t=new TreeMap<>();
			t.putAll(h);
			List<String> l=new ArrayList<>(t.values());
	    	return l;*/
		Collections.sort(l);
		return l;
}
	
	public static void main(String st[]) {
		Lab7_1 l7=new Lab7_1();
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("one", "Abc");
		hm.put("two", "Bcd");
		hm.put("three","Ecd");
		hm.put("four", "Cde");
		hm.put("five", "Def");
		 
		System.out.println(l7.getValues(hm));
		
	}

}
