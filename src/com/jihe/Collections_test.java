package com.jihe;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		Collections.addAll(list,"清","晨","我","上","马");
		System.out.println("排序前:"+list);
		
		Collections.reverse(list);	
		System.out.println("反转后:"+list);
		
		Collections.sort(list);
		System.out.println("自然排序后:"+list);
		
		Collections.shuffle(list);
		System.out.println("随机排序后:"+list);
		
		Collections.swap(list,0,list.size()-1);
		System.out.println("首尾交换后:"+list);
		
		ArrayList<Integer> list2=new ArrayList<>();
		Collections.addAll(list2,-1,-6,7,0,9);
		System.out.println("集合中的元素:"+list);
		System.out.println("集合中的最大元素:"+Collections.max(list2));
		System.out.println("集合中的最小元素:"+Collections.min(list2));
		Collections.replaceAll(list2, 7, 0);	
		System.out.println("替换后的集合:"+list2);
		Collections.sort(list2);
		System.out.println("集合排序后为:"+list2);
		//先排序，后二分查找
		int index=Collections.binarySearch(list2, 9);
		System.out.println("集合通过二分查找方法查找元素9所在的角标为:"+index);
	}

}
