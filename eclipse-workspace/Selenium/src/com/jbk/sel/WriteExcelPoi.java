package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// prog. for write Excel sheet by poi xlsx format
public class WriteExcelPoi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    File file = new File("D:\\mangesh.xlsx");
    FileInputStream fis = new FileInputStream(file);
    		
    XSSFWorkbook wb = new XSSFWorkbook(fis);
    XSSFSheet sh = wb.getSheet("Sheet1");
    sh.getRow(0).createCell(3).setCellValue("Pass");
    sh.getRow(1).createCell(3).setCellValue("Fail");

    sh.getRow(1).createCell(4).setCellValue("Mangesh");
    FileOutputStream fout = new FileOutputStream(file);
    wb.write(fout);
    wb.close();
	}

}
