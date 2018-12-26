package Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SampleAdmin {

	
	
	static Logger logger=Logger.getLogger(SampleAdmin.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("SampleAdmin debug Message");
		logger.info("SampleAdmin info message");
		logger.warn("SampleAdmin warn message");
		logger.error("SampleAdmin Error mesassage");
		logger.fatal("SampleAdmin fatal message");
		
		
		SampleReport obj= new SampleReport();
		obj.generateReport();
	}
	
	
}
