package com.jihe;

import java.util.HashSet;

class Person{
	String name;
	int age;
	@Override
	public int hashCode() {
		
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Person other = (Person) obj;
		
		return name.equals(other.name);
	}
	@Override
	public String toString() {
		return name + ":"+ age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class P_1 {

	public static void main(String[] args) {
		Person p1=new Person("sss",12);
		Person p2=new Person("ddd",13);
		Person p3=new Person("aaa",15);
		HashSet<Person> ts=new HashSet<Person>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		System.out.println(ts);
	}

}
