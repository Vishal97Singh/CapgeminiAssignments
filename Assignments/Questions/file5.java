class file5{
   public static void main(String st[]){
     int a[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16} };
   
     /* for(int[] i:a)
		  for(int j :i)
			  System.out.print(j+" ");
	  System.out.println();*/
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=0;j<a[i].length;j++)
		  {
			 System.out.print(a[i][j]+" "); 
		  }
		  System.out.println();
	  }
   }
}