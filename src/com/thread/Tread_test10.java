package com.thread;
class EmergencyTread implements Runnable{
public void run() {
	for(int i=1;i<6;i++) {
		System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Tread_test10 {

	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(new EmergencyTread(),"线程1");
		t1.start();
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入"+i);
			if(i==3) {
				t1.join();
			}
		}
	}

}
