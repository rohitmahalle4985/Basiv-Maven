package ExcelSheet;
//prog. for Read Excel sheet by jxl xls format
import java.io.FileInputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelWokSheet {

	public static void main(String[] args)throws Exception {
	FileInputStream fis = new FileInputStream("D:/a.xls");
	
	Workbook wb = Workbook.getWorkbook(fis);
	
	Sheet sh= wb.getSheet(0);
	
	int rows = sh.getRows();
	
	System.out.println(rows);
	
	int col = sh.getColumns();
	
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < col-1; j++) {
			Cell cell = sh.getCell(j, i);
			System.out.println(cell.getContents());
		}
	}
	System.out.println("5");
	System.out.println(col);
	Cell c = sh.getCell(0,0);
	System.out.println(c.getContents());

	}

}
