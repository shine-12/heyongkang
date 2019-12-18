package com.class_cast;

interface Animal{
	void shout();
}
class Tiger implements Animal{
	public void shout(){
		System.out.println("叫");
	}
	public void eatMan(){
		System.out.println("月");
	}
}
class Pig implements Animal{
		public void shout(){
			System.out.println("看看");
		}
}
public class E16 {

	public static void main(String[] args) {
		Animal an1=new Pig();
		
		if (an1 instanceof Tiger) {
			Tiger tiger=(Tiger) an1;
			tiger.shout();
		}
		else {
			System.out.println("试试");
		}
	}
}

