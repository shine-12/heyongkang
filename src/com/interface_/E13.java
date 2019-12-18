package com.interface_;

interface Aniaml{
	int ID=1;

	void shout();
	static int getID(){
		return Aniaml.ID;
	}
}
interface LandAnimal extends Aniaml{
	void run();
}
class Dog implements LandAnimal{
	
	@Override
	public void shout() {
		System.out.println("旺旺...");
		
	}

	@Override
	public void run() {
		System.out.println("代强快跑");
		
	}
}
	

class Cat implements Aniaml{
	public void shout() {
		System.out.println("喵喵...");
}
}
public class E13 {

	public static void main(String[] args) {
		System.out.println(Aniaml.getID());
		Dog dog=new Dog();
		dog.shout();
		Cat cat=new Cat();
		cat.shout();
	}
}
