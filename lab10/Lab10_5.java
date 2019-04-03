package lab10;
/**
 * 
 * @author Vishal Singh
 *
 */

interface Factorial{
	public int factorial(int a);
}

public class Lab10_5 {
	/**
	 * @author Vishal Singh
	 */
	
	 public static int fact(int a) {
		int fact=1;
		while(a>0) {
			fact=fact*a;
			a--;
		}
		return fact;
	 }

	public static void main(String[] args) {
		Factorial ic=Lab10_5::fact;
        System.out.println(ic.factorial(5));
	}

}