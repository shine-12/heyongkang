package com.api;

import java.util.*;


public class System_test {

	public static void main(String[] args) {
		Properties shuxing=System.getProperties();
		//System.out.printIn(shuxing);
		Set<String> shuxingming=shuxing.stringPropertyNames();
		for (String key:shuxingming) {
			String value=System.getProperty(key);
			System.out.println(key+"---->"+value);
		}
	}

}
