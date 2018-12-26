package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadPoiExcel {
	public static void main(String[] args)throws Exception {
		File f = new File("D:\\login.xlsx");
		FileInputStream fis = new FileInputStream(f);
		System.out.println(1);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(2);
		XSSFSheet sh= wb.getSheetAt(0);
		System.out.println(3);
		
		
		int rownum = sh.getLastRowNum();
		System.out.println("Total no of rows are="+rownum);
		//int col=sh.getColumnStyle(column)
		for(int i=0;i<=rownum+1;i++) {
			 {
				System.out.print(sh.getRow(i).getCell(0).getStringCellValue()+"  ");
			}
			System.out.println();
		}
		
		
	}
	
	}
