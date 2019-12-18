package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(25);
		ts.add(8);
		ts.add(17);
		ts.add(17);
		ts.add(13);
		ts.add(11);
		ts.add(1);
		ts.add(15);
		System.out.println("创建的TreeSet集合为:"+ts);
		System.out.println("TreeSet集合首元素为:"+ts.first());
		System.out.println("TreeSet集合尾部元素为:"+ts.last());
		System.out.println("TreeSet中小于或等于9的最大的一个元素为:"+ts.floor(9));
		System.out.println("TreeSet中大于9的最小的一个元素为:"+ts.higher(9));
		System.out.println("删除的第一个元素是"+ts.first());
	}

}
