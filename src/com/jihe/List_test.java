package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型，里面的类型是集合里元素的类型
		//有两个类,前面一个是集合类，后面尖括号里的是集合里元素类型
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		//arrayList.add(5);
		System.out.println("数组列表arrayList的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二个元素是"+arrayList.get(1));
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("stud1");
		linkedList.add("stud2");
		linkedList.offer("offer");
		linkedList.push("push");
		
		//arrayList.add(5);
		System.out.println("链表LinkedList的长度是"+linkedList.size());
		System.out.println("链表LinkedList的第二个元素是"+linkedList.get(1));
		System.out.println("链表的第一个元素是"+linkedList.getFirst());
		System.out.println(linkedList);
		
		String dygys=linkedList.peek();
		System.out.println("链表LinkedList的第一个元素是："+dygys);
		
		linkedList.removeFirst();
		linkedList.pollLast();
		System.out.println(linkedList);
	}

}
