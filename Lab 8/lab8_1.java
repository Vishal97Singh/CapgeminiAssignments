package lab2;
class CopyDataThread extends Thread{
	public void run() {
		System.out.println("hell");
	}
}

public class lab8_1 {
	CopyDataThread cd=new CopyDataThread();
      public void run() {
    	  cd.run();
		
	}
}
