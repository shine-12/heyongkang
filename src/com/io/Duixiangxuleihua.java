package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Duixiangxuleihua {

	public static void main(String[] args) throws Exception {
		//对象输出流
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("d:\\obj.txt"));
		Person p1=new Person("mike", 40);
		out.writeObject(p1);
		//对象输入流
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("d:\\obj.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name="+person.getName());
		System.out.println("age="+person.getAge());
	}

}
