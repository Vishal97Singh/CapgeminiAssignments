import java.util.*;
class Ass1{
   int sum=0;
  public int calculateSum(int n){
   for(int i=0;i<=n;i++){
     if( (i%3==0 || i%5==0) )
	   sum+=i;
   }
   return sum;
  }
}
class test{
	 public static void main(String st[]){
	  Ass1 a=new Ass1();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.calculateSum(n));
	  
  }
	
}