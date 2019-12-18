package com.jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("张三");
		list.add("张四");
		list.add("张五");
		list.add("张六");
		
		//把集合变成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合里所有姓张的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合里第二个和第三个姓张的人:");
		list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).forEach(j->System.out.println(j));
					
		System.out.println("集合里第二个和第三个姓张的人用和连接:");
		String string=list.stream().filter(k->k.startsWith("张")).skip(1).limit(2).collect(Collectors.joining(","));
		System.out.println(string);
	}

}
