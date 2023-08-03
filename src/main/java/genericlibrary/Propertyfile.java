package genericlibrary;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public String gerPropertydata(String key) throws IOException
	{
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Ipathconstant.propertyfilepath);
		
		p.load(fis);
		return p.getProperty(key);
		
		
			
		
		
	}

	
	}


