package com.jihe;

import java.util.ArrayList;
import java.util.Iterator;

public class Diedai_xiugai {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		Iterator<String> diedai=arrayList.iterator();
		while (diedai.hasNext()) {
			String string=(String) diedai.next();
			if(string.equals("stud2")) {
				arrayList.remove(string);
				break;
			}
		}
		System.out.println(arrayList);
	}

}
