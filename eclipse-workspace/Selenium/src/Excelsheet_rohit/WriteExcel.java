package Excelsheet_rohit;

//prog. for write Excel sheet by jxl xls format

import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;


public class WriteExcel {
	//1-set loc of file
	private static final String Excel_file_loc = "D:/ABC.xls";
	public static void main(String[] args) throws WriteException {
	
	//2-create 	WritableWorkbook obj to create a new file 
		WritableWorkbook mywork = null;
		try {
			File file=new File(Excel_file_loc);
			
			mywork = Workbook.createWorkbook(file);
	//3-create a sheet		
			WritableSheet excelSheet = mywork.createSheet("Sheet1",0);
			
			
//(0,0,"TestCount")-1st for col  nad 2nd for row and third is label value			
			Label lable = new Label (0,0,"Test count");
			excelSheet.addCell(lable);
			
			Number num = new Number(0,1,1);//1st arg-col and 2nd-row 
			excelSheet.addCell(num);
			
			Label lab = new Label (1,0,"Result");
			excelSheet.addCell(lab);
			
			Label lable1 = new Label (1,1,"passed");
			excelSheet.addCell(lable1);
			
			Number num1 = new Number(0,2,2);
			excelSheet.addCell(num1);
			
			Label lable2 = new Label (1,2,"passed 2");
			excelSheet.addCell(lable2);
			
			mywork.write();
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(WriteException e) {
			e.printStackTrace();
		}finally {
			if(mywork != null) {
				try {
					mywork.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
