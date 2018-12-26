package PropertyFile;

import java.io.FileInputStream;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class exelSheet_reading {
public static void main(String[] args) throws Exception {
	
	System.out.println(1);
	
	FileInputStream fis=new FileInputStream("D:\\rohit.xls");
	
	Workbook w=Workbook.getWorkbook(fis);//static class
	
	Sheet s=w.getSheet(0);
	Cell c=s.getCell(0,0);
	System.out.println(c.getContents());
	
}
}
