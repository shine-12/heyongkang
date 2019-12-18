package com.abstract_;
abstract class Aniaml{
	public abstract void shout();
}
class Dog extends Aniaml{
	public void shout() {
		System.out.println("旺旺...");
	}
	
}
class Cat extends Aniaml{
	public void shout() {
		System.out.println("旺旺...");
}
}
public class E12 {

	public void main(String[] args) {
		Dog dog=new Dog();
		dog.shout();
		Cat cat=new Cat();
		cat.shout();
		

	}

}
