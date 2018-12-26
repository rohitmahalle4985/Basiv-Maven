package selenium_basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class zipCreation {
	public static void main(String[] args) {
		
		try{
			FileOutputStream fos=new FileOutputStream("D://jbkScreenShot.zip");
			
			ZipOutputStream zos=new ZipOutputStream(fos);
			
			//Input data from file
			
		String filename1="D://jbkScreenShot1.zip";
		String filename2="D://jbkScreenShot2.zip";
		
		//call method with parameter
		
		addToZipFile(filename1,zos);
		addToZipFile(filename2,zos);
	}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
//common method to create a zip file
	
	public static void addToZipFile(String fileName,ZipOutputStream zos) throws FileNotFoundException,IOException
	{
		System.out.println("Writing "+fileName+"to zip file");
		
		File file=new File(fileName);
		FileInputStream fis=new FileInputStream(file);
		ZipEntry zipentry=new ZipEntry(fileName);
		zos.putNextEntry(zipentry);
		
		//write data byte by byte
		byte[] bytes=new byte[1024];
		int lenght;
		while(( lenght=fis.read(bytes))>=0)
		{
			zos.write(bytes,0,lenght);
		}
		zos.closeEntry();
		fis.close();
		
		
		
		
		
	}

}
