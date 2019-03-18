import java.util.*;
class Ass3{
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
class test{
	 public static void main(String st[]){
	  Ass3 a=new Ass3();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(a.checkNumber(n));
	  
  }
	
}