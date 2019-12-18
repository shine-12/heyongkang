package com.api;

public class E54 {

	public static void main(String[] args) {
		String s1=" a我b爱f中1国254";
		System.out.println("这个字符里的数字是：");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		//foreach循环：对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者数组
		for(char zf:zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.println(zf);
			}
		}
		System.out.println("\n这个字符串里的汉字是：");
		for(char zf:zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf);
			}
		}
	}

}
