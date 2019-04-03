package lab5;

import java.util.Scanner;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Lab5_2 {
	public int fibonacci(int n) {
		int first=1;
		int second=1;
		int a[]=new int[n];
		a[0]=first;
		a[1]=second;
		int i=2,p=0;
		while(i<n) {
			p=first+second;
			a[i]=p;
			first=second;
			second=p;
			i++;
		}
		return a[n-1];
	}
	
	public int recursiveFibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return (recursiveFibonacci(n-1)+recursiveFibonacci(n-2));
		}
	}
	public static void main(String args[]) {
		Lab5_2 l52=new Lab5_2();
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(l52.fibonacci(n));
		System.out.println(l52.recursiveFibonacci(n));
		sc.close();
	}

}
