package lab1;
import java.util.*;
/**
 * 
 * @author Vishal Singh
 *
 */
class Ass{
	boolean check=true;
	int i=0;
  public boolean checkNumber(int n){
   int n1=n;
         int p;
	     p=n1%10;
		 n1=n1/10;   
    
	while(n>0){ 
	     int q;
	     q=n%10;
		 n=n/10;
	     
		 if(q>p)
		 {
		   check=false;
	       break;
		 }
         p=q;
	} 
  
		return check;
  }
}
public class Lab1_3{
	 public static void main(String st[]){
	  Ass a=new Ass();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.checkNumber(n));
	  sc.close();
	  
  }
	
}