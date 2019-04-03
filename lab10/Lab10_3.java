package lab10;
interface Validation{
	public boolean validate(String username,String pwd);
}
/**
 * @author Vishal Singh
 *
 */
public class Lab10_3 {

	public static void main(String[] args) {
		Validation v=(s1,s2)->{ if(s1.length()==0 || s2.length()<6) {
			return false;
		}
		else {
			return true;
		}
			
		};
	  System.out.println(v.validate("Vishal", "password"));	

	}
}
