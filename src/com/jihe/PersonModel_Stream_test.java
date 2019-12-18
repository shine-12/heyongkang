package com.jihe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonModel_Stream_test {

	public static void main(String[] args) {
		List<PersonModel> list=new ArrayList<>();	
		PersonModel p1=new PersonModel("sss",15,"男");
		PersonModel p2=new PersonModel("ddd",18,"女");
		PersonModel p3=new PersonModel("fff",17,"男");
		PersonModel p4=new PersonModel("hhh",35,"男");
		list=Arrays.asList(p1,p2,p3,p4);
		
		//old
		for (PersonModel pm:list) {
			System.out.println(pm.getName());
		}
		
		//new 1
		List<String> list2=list.stream().map(pm->pm.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//new 2
				List<String> list3=list.stream().map(PersonModel::getName).collect(Collectors.toList());
				System.out.println(list3);
		//new 3
		List<String> list4=list.stream().map(pm->{
			return pm.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}

}
