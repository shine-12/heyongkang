package com.Net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatReceiver implements Runnable {
	private DatagramSocket ds;
	public ChatReceiver(DatagramSocket ds) {
		this.ds=ds;
	}
	
	@Override
	public void run() {
		byte[] buf=new byte[1024];
			DatagramPacket dp=new DatagramPacket(buf,buf.length);
		while(true) {
		try {
				ds.receive(dp);
				String xinxi=new String(dp.getData(),0,dp.getLength());
				System.out.println(xinxi);}
		 catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		 }
		}
	}
	}

	


