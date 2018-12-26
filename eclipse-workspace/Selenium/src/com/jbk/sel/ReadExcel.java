package com.jbk.sel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//prog. for Read Excel sheet by poi  xlsx format
public class ReadExcel {
public static void main(String[] args)  {
	try {
	FileInputStream file = new FileInputStream(new File("D:\\login.xlsx"));
	XSSFWorkbook wb = new XSSFWorkbook(file);
    XSSFSheet sh = wb.getSheetAt(0);
    Iterator<Row> rowit = sh.iterator();
    while(rowit.hasNext()) {
    	Row r = rowit.next();
    	Iterator<Cell> colit = r.cellIterator();
        while(colit.hasNext()) {
        Cell cell = colit.next();
     
    switch(cell.getCellType()) {
    case Cell.CELL_TYPE_NUMERIC:
    	System.out.println(cell.getNumericCellValue()+"\t");
    	break;
    case Cell.CELL_TYPE_STRING:
    	System.out.println(cell.getStringCellValue()+"\t");
    	break;
    }
    }
    
    System.out.println("");
        
   }
    file.close();
}catch(Exception e) {
	e.printStackTrace();
}
}
}
