package com.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Net_test1 {

	public static void main(String[] args) throws Exception {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("本机的Ip地址是:"+ip.getHostAddress());
		InetAddress ip2=InetAddress.getByName("www.hbjhart.com");
		System.out.println("江汉艺术职业学院web服务器的Ip地址是:"+ip2.getHostAddress());
		if(ip2.isReachable(3000)) {
			System.out.println("从本机到江汉艺术职业学院web服务器3秒可达");
		}else {
			System.out.println("从本机到江汉艺术职业学院web服务器的名字是:"+"www.hbjhart.com");
		}
	}

}
