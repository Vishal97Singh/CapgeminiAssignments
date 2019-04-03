package lab1;
import java.util.*;
/**
 * 
 * @author Vishal Singh
 *
 */
class Assign{
   boolean b=true;
  public boolean checkNumber(int n){
     while(n!=1){
		 if(n%2!=0)
		  { 
	      b=false;
	      break;
		  }
		   n=n/2;
	    }
		return b;
  }
}
public class Lab1_4{
	 public static void main(String st[]){
	  Assign a=new Assign();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.checkNumber(n));
	  sc.close();
	  
  }
	
}