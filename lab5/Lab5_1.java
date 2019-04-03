package lab5;
import java.util.*;
/**
 * 
 * @author Vishal Singh
 *
 */
public class Lab5_1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Red or Yello or Green to check Signal");
		String str=sc.nextLine();
		switch(str) {
		case "Red": System.out.println("Stop");
		                 break;
		case "Yello":System.out.println("Ready");
                 break;
		case "Green":System.out.println("Go");
                  break;
        default: System.out.println("Wrong Choice");
		}
		
	}

}
