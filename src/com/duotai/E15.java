package com.duotai;
interface Animal{
	void shout();
}
class Dog implements Animal{
	@Override
	public void shout(){
		System.out.println("旺旺.");
	}
}
class Cat implements Animal{
	@Override
	public void shout() {
		System.out.println("喵喵.");
	}
}
public class E15 {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.shout();
		cat.shout();
	}

}
class Employee{}
class Manager extends Employee{}
class Director extends Employee{}
