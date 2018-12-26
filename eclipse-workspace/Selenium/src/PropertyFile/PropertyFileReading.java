package PropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.ReporterConfig.Property;

public class PropertyFileReading {
	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream("D:\\login.properties");
		p.load(fis);
		System.out.println(p);
		
	}

}
