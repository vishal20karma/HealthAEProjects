package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class globalData {

	public static Properties file() throws IOException   {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//dataStores//globalKeys.properties");
	prop.load(fis);
	return prop;
	}

}
