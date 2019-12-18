package com.chapter4;

class Animal {
	//定义Animal类的构造方法
	public Animal(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog extends Animal{
	//String name="犬类";
	public Dog() {
		super("哈巴");
	}

/*public void printName() {
	System.out.println("name="+name);
}*/
}
	
public  class E01{
	public static void main(String[] args) {
		Dog dog=new Dog();
		/*dog.name="哈士奇";
		dog.printName();
		dog.shout();*/
	}
}

