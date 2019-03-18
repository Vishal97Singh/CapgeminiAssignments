import java.util.*;
class file4{
 double avg;
 int sum=0;
  public double getAvg(int[]a,int n)
   {
     for(int i=0;i<n;i++)
	 {
	   sum+=a[i];
	 }
	 avg=(double)sum/n;
	 return avg;
   }  
}
class test{
	public static void main(String... s){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of values");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		file4 f4=new file4();
		System.out.println(f4.getAvg(a,n));
		
	}
	
}