package jjj;

public class Test {

	public Test() {
		System.out.println("构造方法一被调用了");
	}
	public Test(int x) {
		this();
		System.out.println("构造方法二被调用了");
	}
	public Test(boolean b) {
		this(1);
		System.out.println("构造方法三被调用");
	}
	public void openMouth() {}
	public void speak() {this.openMouth();}
	public static void main(String[] args) {
		new Test(true);
	}
}
