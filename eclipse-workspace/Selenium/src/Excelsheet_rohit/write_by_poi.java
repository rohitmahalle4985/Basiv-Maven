package Excelsheet_rohit;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import jxl.Workbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_by_poi {
          
	
	public static void main(String[] args) {
		
		//Create a blank workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		
		//Create a blank sheet
		XSSFSheet sheet=workbook.createSheet("Employee data");
		
//This data needs to be written (object[])
		
	Map<String,Object[]> data=new TreeMap<String,Object[]>();
	
	data.put("1",new Object[]{"ID","NAME","LAST NAME"});
	data.put("2",new Object[]{1,"Rohit","Mahalle"});
	data.put("3",new Object[]{2,"Pallavi","Mahalle"});
	data.put("4",new Object[]{3,"Ravindra","Mahalle"});
	data.put("5",new Object[]{4,"Meena","Mahalle"});
	
	
//Iterator over data and write to sheet		
	Set<String>keyset=data.keySet();
	int rownum=0;
	
	for(String key:keyset)
	{
		Row row=sheet.createRow(rownum++);
		Object[] objArr=data.get(key);
		
		int cellnum=0;
		for(Object obj:objArr)
		{
			Cell cell=row.createCell(cellnum++);
			
			if(obj instanceof String)
				cell.setCellValue((String)obj);
			
			else if(obj instanceof Integer)
			cell.setCellValue((Integer)obj);
		}
	}
	
	try
	{
		//Write the workbook in file System
		FileOutputStream fos=new FileOutputStream(new File("D:/writepoi.xlsx"));
		workbook.write(fos);
		fos.close();
		
		System.out.println("File written successfully");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		
		
	}
}
