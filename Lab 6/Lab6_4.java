package lab2;

import java.io.File;
import java.util.Scanner;

public class Lab6_4 {
	public static void main(String ard[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name");
		String input=sc.next();
		sc.close();
		File f=new File("F:\\"+input);
		if(f.exists()) {
			System.out.println("File Found");
			if(f.canRead()) {
				System.out.println("Readable");
			}
			else {
				System.out.println("Not readable");
			}
			if(f.canWrite()) {
				System.out.println("Writable");
			}
			else {
				System.out.println("Not Writable");
			}
			String []st=f.getName().split("\\.");
			int len=st.length;
			System.out.println("Type : "+st[len-1]);
			System.out.println("length of File : "+f.length()+" Bytes");
		}
		else {
			System.out.println("File not present");
		}
		
	}

}
