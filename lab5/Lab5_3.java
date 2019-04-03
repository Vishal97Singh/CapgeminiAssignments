package lab5;

import java.util.Scanner;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Lab5_3 {
	int k=0;
	public void getPrime(int n){
		for(int i=2;i<=n;i++) {
			int count=0;
		    for(int j=2;j<i;j++) {
			   if(i%j==0) {
				  count++;
				  break;	
			   }
		    }
			if(count==0) {
              System.out.println(i);
		}
	}		
		
	}
	public static void main(String args[]) {
		Lab5_3 l53=new Lab5_3();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		l53.getPrime(n);
		sc.close();
		
	}

}
