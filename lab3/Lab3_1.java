package lab3;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Lab3_1 {
	public int secondSmallest(int arr[] ) 
     { 
       int i, first, second; 
       int size=arr.length;

       if (size < 2) 
         { 
           System.out.print(" Invalid Input "); 
          // break; 
         } 
       first = Integer.MAX_VALUE; 
       second = Integer.MAX_VALUE;
       for (i = 0; i < size ; i++) 
        { 
           if (arr[i] < first) 
            { 
             second = first; 
             first = arr[i]; 
            } 
          else if (arr[i] < second && arr[i] != first) 
          second = arr[i];
        } 
       return second;	
   }
      
       public int secondLargest(int arr[] ) 
       { 
         int i, first, second; 
         int size=arr.length;

         if (size < 2) 
           { 
             System.out.print(" Invalid Input "); 
            // break; 
           } 
         first = Integer.MIN_VALUE; 
         second = Integer.MIN_VALUE;
         for (i = 0; i < size ; i++) 
          { 
             if (arr[i] > first) 
              { 
               second = first; 
               first = arr[i]; 
              } 
            else if (arr[i] > second && arr[i] != first) 
            second = arr[i];
          } 
return second;	
}
	public static void main(String st[]) {
		int a[]= {10,10,20,45,67,89,90,90};
		Lab3_1 l31=new Lab3_1();
		System.out.println("Second Smallest : "+l31.secondSmallest(a));
		System.out.println("Second Largest : "+l31.secondLargest(a));

	}
  
}
