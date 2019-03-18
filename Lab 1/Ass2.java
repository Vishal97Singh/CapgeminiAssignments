import java.util.*;
class Ass2{
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
class test{
	 public static void main(String st[]){
	  Ass2 a=new Ass2();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.calculateDifference(n));
	  
  }
	
}