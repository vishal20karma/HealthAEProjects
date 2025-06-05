package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {

	public static Object[][] readFromExcel(String excelFilePath, String sheetName) throws IOException   {
	XSSFWorkbook workbook = new XSSFWorkbook(excelFilePath);
	XSSFSheet sheet = workbook.getSheet(sheetName);
	XSSFRow headerRow = sheet.getRow(0);
	int columnCount = headerRow.getPhysicalNumberOfCells();
	int rowCount = sheet.getPhysicalNumberOfRows();
	Object [][] data = new Object[rowCount-1][columnCount];
	
	for (int i=1;i<rowCount;i++)   {
	XSSFRow row = sheet.getRow(i);
	for (int j=0;j<columnCount;j++)   {
	String cellValue = row.getCell(j).getStringCellValue();
//	System.out.println(cellValue);
	data[i-1][j]=cellValue;
	}
	}
	workbook.close();
	return data;
	}
}	

