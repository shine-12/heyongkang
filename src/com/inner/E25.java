package com.inner;
//声明一个函数式接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpper(String str) {
		System.out.println(str.toUpperCase());
	}
}
//定义测试类
public class E25 {

	public static void main(String[] args) {
		StringUtils su=new StringUtils();
		//使用Lambda表达式方式
		printUpper("Hello",t->su.printUpper(t));
		//使用方法引用的方式
		printUpper("World",su::printUpper);

	}

	private static void printUpper(String str,Printable pt) {
		pt.print(str);
	}
}
