package com.jihe;

import java.util.TreeSet;

class Teacher implements Comparable<Object>{
	String name;
	int age;

	public Teacher(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return name+":"+age;
	}
	@Override
	public int compareTo(Object obj) {
		Teacher teacher=(Teacher)obj;
		return this.age-teacher.age;
	}
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher> ts=new TreeSet<Teacher>();
		ts.add(new Teacher("庹giao",30));
		ts.add(new Teacher("强giao",23));
		ts.add(new Teacher("双deidei",43));
		System.out.println(ts);
	}

}
