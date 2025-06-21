package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {

/*	public static Object[][] readFromExcel(String excelFilePath, String sheetName) throws IOException   {
	XSSFWorkbook workbook = new XSSFWorkbook(excelFilePath);
	XSSFSheet sheet = workbook.getSheet(sheetName);
	XSSFRow headerRow = sheet.getRow(0);
	int columnCount = headerRow.getPhysicalNumberOfCells();
	int rowCount = sheet.getPhysicalNumberOfRows();
	Object [][] data = new Object[rowCount-1][columnCount];   //0th Index is header, therefore -1 has been done
	
	for (int i=1;i<rowCount;i++)   {   //Started from 1st row, because 0th index is header
	XSSFRow row = sheet.getRow(i);
	for (int j=0;j<columnCount;j++)   {
	String cellValue = row.getCell(j).getStringCellValue();
//	System.out.println(cellValue);
	data[i-1][j]=cellValue;   //Already 0th Index is header and -1 already done above, but still in Java we need to store from 0th Index in Object [][] data that is why -1 has been done here.
	}
	}
	workbook.close();
	return data;   */
	
//  For Practice
	public static Object [][] readFromExcel(String excelFilePath, String sheetName) throws IOException   {
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
//  System.out.println(cellValue);
    data [i-1][j]=cellValue;
	}
	}
	workbook.close();
	return data;
	}

}	

