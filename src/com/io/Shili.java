package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili {

	public static void main(String[] args) throws Exception {
		FileInputStream shilishuju=new FileInputStream("shili.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(shilishuju);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		Map map=new HashMap<>();
		for(int i=1;i<rows;i++) {
			XSSFRow rowi=sheet.getRow(i);
			Iterator<Cell> celljihe=rowi.cellIterator();
			List list=new ArrayList<>();
			while (celljihe.hasNext()) {
				Cell cell = (Cell) celljihe.next();
				if(cell.getCellType()==CellType.STRING) {
					list.add(cell.getStringCellValue());
				}else if(cell.getCellType()==CellType.STRING) {
					list.add(cell.getStringCellValue());
				}
			
		}

			System.out.println(map);
			FileInputStream shilishuju_dest=new FileInputStream("18rj2.xlsx");
			XSSFWorkbook wb_dest=new XSSFWorkbook(shilishuju_dest);
			XSSFSheet sheet_dest=wb.getSheet("Sheet1");
			int rows_dest=sheet_dest.getLastRowNum();
			for (int j = 1; j < rows_dest; j++) {
				XSSFRow rowi_dest=sheet_dest.getRow(j);
				String xuehao=rowi_dest.getCell(3).getStringCellValue();
				rowi_dest.createCell(15,CellType.STRING).setCellValue("4.7");
				List list_dest=(ArrayList)map.get(xuehao);
				System.out.println(list_dest);
				if (list_dest!=null) {
					rowi_dest.createCell(15,CellType.STRING).setCellValue(list_dest.get(11).toString());
					rowi_dest.createCell(16,CellType.STRING).setCellValue(list_dest.get(12).toString());
				}
			}
			
			
			FileOutputStream shilishujushuchu_dest=new FileOutputStream("18rj2.xlsx");
			wb_dest.write(shilishujushuchu_dest);
			shilishujushuchu_dest.close();
	}

	}
}