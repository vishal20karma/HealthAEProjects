package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonUtility {
//StandarCharsets encoding used because 'readFileToString' has been depreciated 
//Json to String - Jackson Databind dependencies jars
/*	public static Object[][] getJsonData(String filepath) throws IOException   {
	String jsonData = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);	
	ObjectMapper mapper =  new ObjectMapper();
	List<HashMap<String, String>> data = 
			mapper.readValue(jsonData, new TypeReference<List<HashMap<String, String>>>(){});
	Object [][] jsonTestData = new Object [data.size()][1];   //Here data.size() and 1 are lengths and specially 1 is that one hashmap there
	for (int i=0;i<data.size();i++)   {
	jsonTestData[i][0] = data.get(i);   //Here i and 0 are indexes
	}
	return jsonTestData;   */

//  For Practice
	public static Object[][] getJsonData(String filepath) throws IOException   {
	String jsonData = FileUtils.readFileToString(new File(filepath), StandardCharsets.UTF_8);	
	ObjectMapper mapper = new ObjectMapper();
	List<HashMap<String, String>> data = 
			mapper.readValue(jsonData, new TypeReference<List<HashMap<String, String>>>(){});
	Object [][] jsonTestData = new Object[data.size()][1];
	for (int i=0;i<data.size();i++)   {
	jsonTestData [i][0] = data.get(i);	
	}
	return jsonTestData;
	}

}
