package com.api;

public class Sub_Split {

	public static void main(String[] args) {
		String string="2019-10-12";
		System.out.println("今天是"+string.substring(8)+"号");
		System.out.println("本月是"+string.substring(5,7)+"月");
		System.out.println("今年是"+string.substring(0,4)+"年");
		String[] zfcsz=string.split("-");
		System.out.println("今天是:"+zfcsz[0]+"年"+zfcsz[1]+"月"+zfcsz[2]+"日")
		;
	}

}
