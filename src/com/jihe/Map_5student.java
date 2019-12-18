package com.jihe;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_5student {

	public static void main(String[] args) {
		Map<String,String> hmap=new TreeMap<String,String>();
		hmap.put("3","Lucy");
		hmap.put("4","John");
		hmap.put("1","Smith");
		hmap.put("5","Aimee");
		hmap.put("2","Amanda");
		System.out.println(hmap);
		System.out.println("这个双列集合中所有键的集合是:"+hmap.keySet());
		
		Set<String> jianji=hmap.keySet();
		Iterator<String> diedai= jianji.iterator();
		while (diedai.hasNext()) {
			Object key=(Object) diedai.next();
			Object value=hmap.get(key);
			System.out.println(key+":"+value);
			}
	}

}
