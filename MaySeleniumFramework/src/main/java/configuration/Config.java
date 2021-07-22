package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
	
	
 public static String getPropertyValue(String PropertyName) {
		// TODO Auto-generated method stub
		FileReader input=null;
		
		try {
			 input=new FileReader("C:\\Users\\hp\\eclipse-workspace\\MaySeleniumFramework\\src\\main\\java\\configuration\\Configuration");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p=new Properties();
		
		try {
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  return p.getProperty(PropertyName);
	

	}
	

}
