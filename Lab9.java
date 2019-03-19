package lab2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Lab9 {
	public static void main(String args[]) {
		Runnable r=()->{
			int a=10;
			int b=20;
			System.out.println(Thread.currentThread().getName());
			System.out.println(a+b);	
		};
		
		Runnable r1=()->{

			System.out.println(Thread.currentThread().getName());
			System.out.println("Hello");	
		
		};
		ExecutorService ex= Executors.newFixedThreadPool(4);
		for(int i=0;i<20;i++) {
			ex.execute(r);
		}
		
		ScheduledThreadPoolExecutor stpe=(ScheduledThreadPoolExecutor)Executors.newScheduledThreadPool(1);
		ScheduledFuture sf=stpe.scheduleAtFixedRate(r,2, 2, TimeUnit.SECONDS);
	       stpe.schedule(r1, 10, TimeUnit.SECONDS);
		
	}

}
