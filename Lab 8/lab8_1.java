package lab2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class lab8_1 extends Thread {
	FileReader fr=null;
	FileWriter fw=null;
	
	public lab8_1(FileReader fr, FileWriter fw) {
		super();
		this.fr = fr;
		this.fw = fw;
	}
	@Override
	public void run() {
		int a=0;
		int count=0;
		try {
			while((a=fr.read())!=-1) {
				char ch=(char)a;
				fw.write(ch);
				fw.flush();
				count++;
				if(count==10) {
					System.out.println("10 characters are copied");
					count=0;
					Thread.sleep(5000);
				}
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

      public static void main(String[] args) throws Exception {
		FileReader fis=new FileReader("F:\\source.txt");
		FileWriter fos = new FileWriter("F:\\target1.txt");
		lab8_1 c=new lab8_1(fis,fos);
		c.start();
	}
}
	

 