package lab10;

/**
 * @author Vishal Singh
 *
 */
interface lab{
	public int power(double a,double b);
}

public class Lab10_1 {
	
	public static void main(String[] args) {
		lab l=(a,b)->{return (int) Math.pow(a, b);};
		System.out.println(l.power(3, 4));
		

	}

}
