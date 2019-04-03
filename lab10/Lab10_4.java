package lab10;

/**
 * 
 * @author Vishal Singh
 *
 */
interface InstanceCreation{
	public int creation(int a,int b);
}

public class Lab10_4 {
	/**
	 * @author Vishal Singh
	 */
	int id;
	String name;
	
	 public static int refer(int a,int b) {
		return a*b;
	 }

	public static void main(String[] args) {
		InstanceCreation ic=Lab10_4::refer;
        System.out.println(ic.creation(2, 7));
	}

}
