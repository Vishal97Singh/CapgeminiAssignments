package lab1;
import java.util.*;
class Assign2{
/**
 * @author Vishal Singh
 * 
 */
   int sum=0,squareSum=0,sumSquare=0;
  public int calculateDifference(int n){
   for(int i=1;i<=n;i++){
	   sum+=i;
	   squareSum+=(i*i); 
   }
    sumSquare=sum*sum;
   return (squareSum-sumSquare);
  }
}
public class Lab1_2{
	 public static void main(String st[]){
	  Assign2 a=new Assign2();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.calculateDifference(n));
	  sc.close();
	  
  }
	
}