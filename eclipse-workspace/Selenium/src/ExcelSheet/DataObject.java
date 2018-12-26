package ExcelSheet;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class DataObject {
	public static void main(String[] args) {
		try {
		//File f = new File("D:\\login.xls");
		FileInputStream fis = new FileInputStream("D:\\login.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("m");
		int rows = sh.getRows();
		int col = sh.getColumns();
		System.out.println(rows+" "+col);
		Object data[][] = new Object[rows-1][col];
		for (int i= 1 ; i < rows; i++) {

			for (int j=0; j < col; j++) {
				data[i-1][j] = sh.getCell(j, i).getContents();
			}}
		
		}catch(Exception e ) {
			e.printStackTrace();
		}
		}}