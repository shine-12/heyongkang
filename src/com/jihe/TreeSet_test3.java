package com.jihe;

import java.util.Comparator;
import java.util.TreeSet;

class Mycomparator implements Comparator<Object>{
	
	public int compare(Object o1,Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.length()-s2.length();
	}
}
public class TreeSet_test3 {

	public static void main(String[] args) {
	
		TreeSet<String> ts=new TreeSet<String>(new Mycomparator());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eve");
		System.out.println(ts);
		
		TreeSet<String> ts2=new TreeSet<String>((o1,o2) ->{
			String s1=(String) o1;
			String s2=(String) o2;
			return s1.length() -s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eve");
		System.out.println(ts2);
	}

}
