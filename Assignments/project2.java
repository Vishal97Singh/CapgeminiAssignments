class project2{
 
   int arr[]=new int[5];
   public void bubble(int []a,int n){
	   for(int i=0;i<n;i++)
        {
         for(int j=i+1;j<n;j++)
	     {
	      int temp;	  
	      if(a[i]>a[j])
	      {
		  
	       temp=a[i];
		   a[i]=a[j];
		   a[j]=temp;
	      }
	    }
	  }
	for(int i=0;i<5;i++)
     System.out.print(a[i]+" ");
    System.out.println();
 }
}
class test{ 
   public static void main(String arg[]){
	   int a[]=new int[5];
	   for(int i=0;i<5;i++)
		   a[i]=Integer.parseInt(arg[i]);
	   
	   project2 p2=new project2();
	   p2.bubble(a,5);
	   
	   
  }
}