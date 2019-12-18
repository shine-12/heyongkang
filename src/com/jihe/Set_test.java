package com.jihe;

import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add(new String("Jack"));
		hset.add(new String("Eva"));
		hset.add(new String("Rose"));
		hset.add(new String("Rose"));
		hset.add(new String("Pete"));
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
		hset.removeAll(hset);
		HashSet<Integer> hset2=new HashSet<Integer>();
		hset2.add(1);
		hset2.add(2);
		hset2.add(3);
		hset2.add(4);
		hset2.add(5);
		hset2.add(5);
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
	}

}
