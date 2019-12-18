package com.ljhs;
class Person{
	@Override
	public void finalize() {
		System.out.println("对象将被作为垃圾回收...");
	}
}
public class E37 {

	public static void recyclegWsate1() {
		Person p1=new Person();
		p1=null;//让p1对象成为垃圾
		//循环执行语句
		int i=1;
		while(i<10) {
			System.out.println("方法1循环中...");
			i++;
		}
	}
	public static void recyclegWsatel2() {
		Person p2=new Person();
		p2=null;//让p2对象成为垃圾
		//强制回收垃圾对象
		//循环执行语句
		System.gc();
		int i=1;
		while(i<10) {
			System.out.println("方法2循环中...");
			i++;
		}
	}
	public static void main(String[] args) {
		recyclegWsate1();
		System.out.println("============");
		recyclegWsatel2();
	}

}
