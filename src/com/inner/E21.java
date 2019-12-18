package com.inner;
//函数式接口注解:表明注解下面的接口有且仅有一个抽象方法
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵...");
		
	}
}
public class E21 {

	public static void main(String[] args) {
		//第一种方式:用用具体Cat类的对象调用手套、方法
		Cat cat=new Cat();
		cat.shout();
		//第二种方式，用匿名内部类的方式调用shout方法
		animalShout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("旺旺...");
			}
		});
		//第三种方式。用lambda表达式调用shout方法
		//lambda表达式有三部分组成
		//():参数列表    ->箭牌     {方法主体}
		animalShout(()->{System.out.println("aow...");
					     System.out.println("I am a tiger");});
		showSum(10,30,(x,y)->x+y);
	}

	private static void animalShout(Animal animal) {
		animal.shout();
		
	}

	private static void showSum(int x,int y,Calculate c) {
		System.out.println(x+"+"+y+"的和是"+c.sum(x,y));
		
	}

}
