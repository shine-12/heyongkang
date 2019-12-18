package com.jihe;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
		// 赋值符号左边的类或接口可以是右边的类的上一代
		Map<String,String> hmap=new HashMap<String,String>();
		hmap.put("1","Jack");
		hmap.put("2","Rose");
		hmap.put("3","Pete");
		System.out.println(hmap);
		if(hmap.containsKey("1")) {
			System.out.println("这个双列集合包含1");
			System.out.println("这个双列集合包含键1的值是:"+hmap.get("1"));
		}
			//将双列集合Map变成单列的键对象集合使用keySet()方法
			//将双列集合Map变成单列的键对象集合使用values()方法	
			System.out.println("这个双列集合中所有键的集合是"+hmap.keySet());
			System.out.println("这个双列集合中所有键的集合是"+hmap.values());
			//将键为1的值改为Andy
			hmap.replace("1", "Andy");
			System.out.println(hmap);
			//删除键1对应的键key值+value=对entry
			hmap.remove("1");
			System.out.println(hmap);
			
			System.out.println("用键集遍历双列集合的键和值");
			//将双列集合Map变成单列的键对象集合使用Keyset()方法
			Set<String> jianji=hmap.keySet();
			Iterator<String> diedai= jianji.iterator();
			while (diedai.hasNext()) {
				Object key=(Object) diedai.next();
				Object value=hmap.get(key);
				System.out.println(key+":"+value);
			}
			System.out.println("用键集遍历双列集合的键和值");
			//将双列集合Map变成单列的键对象集合使用Keyset()方法
			Set<Map.Entry<String,String>> jianzhiduiji=hmap.entrySet();
			Iterator<Map.Entry<String,String>> diedai2= jianzhiduiji.iterator();
			while (diedai2.hasNext()) {
				Map.Entry<String,String> jianzhidui=(Map.Entry<String,String>) diedai2.next();
				Object key=jianzhidui.getKey();
				Object value=hmap.get(key);
				System.out.println(key+":"+value);
			
	}
			System.out.println("用forEach键值对集遍历双列集合的键和值");
			hmap.forEach((key,value) ->System.out.println(key+":"+value));
			System.out.println("用forEach键值对集遍历双列集合的所有值");
			Collection<String> value=hmap.values();
			value.forEach(v->System.out.println(v));
			
			Map<String,String> hmap1=new HashMap<String,String>();
			hmap1.put("2","Jack");
			hmap1.put("1","Rose");
			hmap1.put("3","Pete");
			hmap1.forEach((key,value1) ->System.out.println(key+":"+value1));
			System.out.println("===========");
			
			Map<String,String> hmap2=new HashMap<String,String>();
			hmap2.put("2","Jack");
			hmap2.put("3","Rose");
			hmap2.put("1","Pete");
			hmap2.forEach((key,value2) ->System.out.println(key+":"+value2));
			System.out.println("===========");
			
	}
}
