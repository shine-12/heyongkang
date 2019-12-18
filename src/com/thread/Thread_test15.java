package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Thread6 implements Callable<Object>{
	@Override
	public Object call() throws Exception {
		int i=0;
		while(i++<5){
			System.out.println(Thread.currentThread().getName()+"的call()方法正在运行");
		}
		return	i;
	}
}

public class Thread_test15 {

	public static void main(String[] args) throws Exception, ExecutionException {
		Thread6 My=new Thread6();
		ExecutorService pool=Executors.newCachedThreadPool();
		Future<Object> res=pool.submit(My);
		Future<Object> res1=pool.submit(My);
		Future<Object> res2=pool.submit(My);
		pool.shutdown();
		System.out.println("Thread-1返回结果"+res.get());
		System.out.println("Thread-2返回结果"+res1.get());
		System.out.println("Thread-3返回结果"+res2.get());
	}

}


