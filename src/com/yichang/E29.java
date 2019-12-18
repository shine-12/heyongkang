package com.yichang;

public class E29 {
	//下面的方法实现了两个整数相除
	public static int divide(int x,int y) {
		try {
			int result=x/y;		//定义一个变量result记录两个数相除的结果
			return result;		//将结果返回
		} catch (Exception e) {		//对异常进行捕获处理
			System.out.println("捕获的异常信息为："+e.getMessage());
		}finally {
			System.out.println("执行finally代码块，无论程序是否异常，都会执行");
		}		
								//定义当程序
		return-1;
	}

	public static void main(String[] args) {
		
			int result=divide(4,0);
			if(result==-1) {
				System.out.println("程序发生异常！");
			}else {
				System.out.println(result);
			}
			

	}

}
