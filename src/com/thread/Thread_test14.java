package com.thread;

class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knivesAndFork=new Object();
	private boolean flag;
	public DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		if (flag) {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if--chopsticks");
					synchronized (knivesAndFork) {
						System.out.println(Thread.currentThread().getName()+"---if--knivesAndFork");
				}
				}
				}
		} else {
			while(true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---else--chopsticks");
					synchronized (knivesAndFork) {
						System.out.println(Thread.currentThread().getName()+"---else--knivesAndFork");
				}
			}
		}
		}
	}
}
public class Thread_test14 {

	public static void main(String[] args) {
		DeadLockThread t1=new DeadLockThread(true);
		DeadLockThread t2=new DeadLockThread(false);
		new Thread(t1,"Chinese").start();
		new Thread(t2,"American").start();
	}

}
