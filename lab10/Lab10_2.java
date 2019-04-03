package lab10;

interface str{
	public void arr(String str);
	
}

public class Lab10_2 {
	/**
	 * @author Vishal Singh
	 * @param args
	 */
	 
	public static void main(String[] args) {
		str l=(str)->{ char []ch=new char[str.length()];
		                 for(int i=0;i<str.length();i++) {
		                	 ch[i]=str.charAt(i);
		                	 System.out.print(ch[i]+" ");
		                 }
		              
				      };
		l.arr("hello");
	}

}
