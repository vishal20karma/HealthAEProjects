package utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonFileReader {
	
public static <T> Object[][] getJsonData(String filePath, TypeReference<List<T>> typeRef)   {
ObjectMapper mapper = new ObjectMapper();
try {
List<T> jsonList = mapper.readValue(new File(filePath), typeRef);
Object[][] data = new Object[jsonList.size()][1];
for (int i=0;i<jsonList.size();i++)   {
data[i][0] = jsonList.get(i);	
}
return data;
} catch (IOException e) {
e.printStackTrace();
return new Object[0][0];
}
	
}
	
}