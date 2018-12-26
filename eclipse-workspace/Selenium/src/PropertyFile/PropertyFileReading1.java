package PropertyFile;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class PropertyFileReading1 {
	FileInputStream fis;
	Properties p;
	@Test
		public void m() throws Exception {
			
			
			fis=new FileInputStream(("user.dir")+"\\config.properties");
			p=new Properties();
			
			p.load(fis);
			System.out.println(p.getProperty("name"));
			

}
			
	}

