package TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReading {
	
	public static void main (String[] args) throws Throwable {
		
		Properties prop = new Properties();
		File file = new File("C:\\Users\\HomePC\\Documents\\Zoom\\files\\ObjectRepo.properties");
		FileInputStream fir = new FileInputStream(file);
		prop.load(fir);
		
		System.out.println(prop.getProperty("UserName"));
		
	}

}
