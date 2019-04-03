package lab8;

import java.util.*;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Lab8_2 implements Runnable{
	public void run() {
		while(true) {
		Date d=new Date();
		System.out.println(d);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public static void main(String s[]) throws InterruptedException{
		Lab8_2 l82=new Lab8_2();
		Thread t=new Thread(l82);
		t.start();
		
		//l82.run();
	}
}
