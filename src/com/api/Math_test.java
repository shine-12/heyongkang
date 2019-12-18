package com.api;

public class Math_test {

	public static void main(String[] args) {
		System.out.println("-5.3的绝对值是"+Math.abs(-5.3));
		System.out.println("-5.3的正弦值是"+Math.sin(-5.3));
		System.out.println("4的绝对值是"+Math.sqrt(4));
		System.out.println("27的立方根是"+Math.cbrt(27));
		System.out.println("3的4次方是"+Math.pow(3,4));
		System.out.println("正切值是"+Math.tan(0.8));
		System.out.println("2的乘方是"+Math.pow(2,2));
		
		System.out.println("求大于参数的最小整数"+Math.ceil(3.4));
		System.out.println("求小于参数的最大整数"+Math.floor(3.4));
		System.out.println("对小数进行四舍五入的结果"+Math.round(-3.6));
		System.out.println("对小数进行取整的结果"+(int)(-3.6));
	}

}
