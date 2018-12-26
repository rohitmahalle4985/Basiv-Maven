package PropertyFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteTOPropertyFile {
	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		p.setProperty("name", "rohit");
		p.setProperty("surname", "mahalle");
		p.setProperty("address", "Amravati");
		
		FileOutputStream fos=new FileOutputStream("D:\\login.properties");
		
		p.store(fos,"updated successfully");
		
		
		
	}

}
