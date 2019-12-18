package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_shili {

	public static void main(String[] args) throws Exception{
		File file=new File("d:\\tice");
		File[] wenjian_jihe=file.listFiles();
		System.out.println(wenjian_jihe.length);
		for(File file2:wenjian_jihe) {
			System.out.println(file2);
			dwj(file2);
		}
		
	}
	public static void dwj(File dqwj) throws Exception {	
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(dqwj);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		for (int i=0; i<rows;i++) {
			//读取每一行
			XSSFRow row=sheet.getRow(i);
			//找到第四个单元格
			XSSFCell cell=row.getCell(3);
			//读取这个单元格的值
			String xuehao=cell.getStringCellValue();
			System.out.println(xuehao);
			//找到第十六个单元格的值
			XSSFCell cell16=row.getCell(15);
			String zuo_shili=cell16.getStringCellValue();
			System.out.println(zuo_shili);
			
			XSSFCell cell17=row.getCell(16);
			String you_shili=cell17.getStringCellValue();
			System.out.println(you_shili);
			
			// 注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 通过驱动获得连接对象
			Connection lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/frrf?characterEncoding=utf8", "root", "123456");
			
			PreparedStatement ydy_yuju=lianjie.prepareStatement("update sheet1 set `左眼裸眼视力`=?,`右眼裸眼视力`=? where `学号`=?");
				ydy_yuju.setString(1, zuo_shili);
				ydy_yuju.setString(2, you_shili);
				ydy_yuju.setString(3, xuehao);
				ydy_yuju.executeUpdate();
		}
	}

}
