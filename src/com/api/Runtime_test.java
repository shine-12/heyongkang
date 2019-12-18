package com.api;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime rt=Runtime.getRuntime();
		System.out.println("本级处理器的个数是"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小是"+rt.freeMemory()/1024/1024+"MBytes");
		System.out.println("最大内存大小是"+rt.maxMemory()/1024/1024+"MBytes");
		
		Process jincheng=rt.exec("notepad");//notepad(记事本) mspaint(画图)
		Thread.sleep(3000);//程序休眠 3 秒
		jincheng.destroy();//关闭进程
	}

}
