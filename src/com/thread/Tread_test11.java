package com.thread;
class TicketWindow3 implements Runnable{
	private int tickets=10;
	Object lock=new Object();
	public void run() {
		while(true) {
			
			synchronized (lock) {
				if(tickets>0) {
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
						}
					}
				}
			
				if(tickets>0) {
					System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
				}else{
					break;
				}
	}
	}
}

public class Tread_test11 {
	
		public static void main(String[] args) {
			TicketWindow3 t2=new TicketWindow3();
			new Thread(t2,"窗口1").start();
			new Thread(t2,"窗口2").start();
			new Thread(t2,"窗口3").start();
		

	}

}
