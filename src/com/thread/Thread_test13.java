package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow5 implements Runnable{
	//定义锁
	private int tickets=10;
	Lock lock=new ReentrantLock();
	public void run() {
		while(true) {
			
			lock.lock();
				if(tickets>0) {
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				
					if(tickets>0) {
						System.out.println(Thread.currentThread().getName()+"正在卖第"+tickets--+"张票");
					}
					}
				}
				}
}
public class Thread_test13 {

	public static void main(String[] args) {
		TicketWindow5 t2=new TicketWindow5();
		new Thread(t2,"窗口1").start();
		new Thread(t2,"窗口2").start();
		new Thread(t2,"窗口3").start();
	
	
	}

}
