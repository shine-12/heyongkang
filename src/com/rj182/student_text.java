package com.rj182;



public class student_text {

	public static void main(String[] args) {
		//对象的创建  类名 对象名称=new 类名() 也就是new+构造方法
		student s1=new student();
		s1.setName("mike");
		s1.setScore(600);
		student s2=new student("serena",590);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		Kecheng c1=new Kecheng();
		c1.setCourse_name("Java程序设计");                              
		c1.setCourse_book("Java基础入门");
		System.out.println(c1.getCourse_name()+"这门课使用的教材是《"+c1.getCourse_book()+"》");
	}
		
}
