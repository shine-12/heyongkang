package com.io;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Bjxx {

	public static void main(String[] args) throws Exception {
		//定义一个目录路径的对象
		Path wb=Paths.get("D:\\360Downloads\\班级信息.txt");
		Path bjmc=Paths.get("D:\\360Downloads\\求班级编号.txt");
		Path bjbh=Paths.get("D:\\360Downloads\\班级编号.txt");
		List<String> neirong=new ArrayList<>();
		Files.createFile(bjbh);
		//读取文件内容
		List<String> lines=Files.readAllLines(wb);
		List<String> names=Files.readAllLines(bjmc);
		for (String name : names) {
			for (String line : lines) {
			String[] zfcsz=line.split("\t");
			if(name.equals(zfcsz[1]))
			//	System.out.println("班级编号:"+zfcsz[0]);
				neirong.add(zfcsz[0]);
			}
			
			}
			Files.write(bjbh, neirong, StandardOpenOption.APPEND);
		}
	}
				

