package Excelsheet_rohit;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Read_Excel_Sheet {

	public static void main(String[] args) throws BiffException, IOException  {
		File file=new File("D:\\pallavi.xls");
		
		Workbook wb=Workbook.getWorkbook(file);
		
		Sheet sheet=wb.getSheet(0);
		
	    int rows = sheet.getRows();
		int col = sheet.getColumns();
		
		System.out.println("Total rows:"+rows+"\n"+"Total columns:"+col);
		
		
	//from sir practical	
		for(int i=0;i<=rows-1;i++) {
			
			for(int j=0;j<=col-1;j++) {
				Cell cell = sheet.getCell(j, i);
				System.out.print(cell.getContents()+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
