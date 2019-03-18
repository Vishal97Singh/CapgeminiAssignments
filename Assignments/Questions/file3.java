import java.util.*;
class file3
{
	int count=0;
    public void prime(int n)
    {
	  for(int i=2;i<=n/2;i++) //Math.sqrt(n)
	  {
		  if(n%i==0)
		  {
			  count++;
		  }
		  
	  }
	  if(count==0)
			  System.out.println("Prime");
		  else
			  System.out.println("Not prime");  
    }
}
class test{
	 public static void main(String st[]){
	  file3 f=new file3();
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  f.prime(n);
	  
  }	
}