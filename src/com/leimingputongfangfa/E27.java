package com.leimingputongfangfa;
@FunctionalInterface
interface Printable{
	void print(StringUtils su,String str);
}
class StringUtils{
	public void printUpper(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E27 {

	public static void printUpper(StringUtils su,String text,Printable pt) {
		pt.print(su,text);
	}
	public static void main(String[] args) {
		printUpper(new StringUtils(),"Hello",(object,t)->object.printUpper(t));
		printUpper(new StringUtils(),"Hello",StringUtils::printUpper);
	}
	
}