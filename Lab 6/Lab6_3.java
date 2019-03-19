package lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab6_3 {
	
	public static void main(String st[]) throws IOException {
		int lines=0,ch=0,words=0;
		
		String s=null;
		FileReader fr=new FileReader("F:\\source.txt");
		 BufferedReader br = new BufferedReader(fr);
		 while((s=br.readLine())!=null) {
		  lines++;
		  ch+=s.length();
		  String []str=s.split("\\s+");
		  words+=str.length;
		  	
		}
		 br.close();
		System.out.println("Characters :"+ch+" Words: "+words+" Lines : "+lines);
	}

}
