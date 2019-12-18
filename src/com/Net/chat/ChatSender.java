package com.Net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int port;
	public ChatSender(DatagramSocket ds, int port) {
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {
			Scanner sc=new Scanner(System.in);
				while(true) {
				try {	
					System.out.println("我bb: ");
					//定义要发送的数据
					String str=sc.nextLine();
					//将数据转换为二进制字节数组	
					byte[] zjsz;
					zjsz=str.getBytes("UTF-8");
					
					System.out.println("这条消息要发送给哪个ip: ");
					String ip=sc.nextLine();
					//创建要发送的数据报
					DatagramPacket dp = new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName(ip),8900);	
					//通过套接字发送数据报
					ds.send(dp);
					
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

	}
	}
}
