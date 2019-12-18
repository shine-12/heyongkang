package com.jihe;

import java.util.HashSet;

class Student {
	String id;
	String name;
	public Student  () {
		super();
	}
	public Student(String id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return id+":"+name;
	}
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		
		return id.equals(other.id);
	}
	
}
	public class HashSet_test{
		public static void main(String[] args) {
			Student s1=new Student("1","Mike");
			Student s2=new Student("1","Mike");
			Student s3=new Student("3","Rose");
			HashSet<Student> hset=new HashSet<Student>();
			hset.add(s1);
			hset.add(s2);
			hset.add(s3);
			System.out.println(hset);
		}
	}

	




