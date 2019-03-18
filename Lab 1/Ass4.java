import java.util.*;
class Ass4{
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
class test{
	 public static void main(String st[]){
	  Ass4 a=new Ass4();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.checkNumber(n));
	  
  }
	
}