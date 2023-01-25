package POM2;

import java.io.IOException;

import org.apache.poi.xssf.binary.XSSFBSheetHandler;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmailUtil {
	static String projectPath = System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public static void getrowcount() {
		try 
		{
			
			System.out.println(projectPath);
			workbook = new XSSFWorkbook(projectPath + "/ExcelFiles/EmailId2.xlsx");
//			workbook = workbook = new XSSFWorkbook("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Maven\\ExcelFiles\\EmailId2.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows:"+rowCount);
		} 

		catch (Exception exp) 
		{
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	
	public static void getCellDataString() {
		try 
		{
			workbook = new XSSFWorkbook(projectPath + "/ExcelFiles/EmailId2.xlsx");
//			workbook = workbook = new XSSFWorkbook("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Maven\\ExcelFiles\\EmailId2.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String abc = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println("Cell Data is:"+abc);
		} 

		catch (Exception exp) 
		{
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void getCellDataNumeric() {
		try 
		{
			workbook = new XSSFWorkbook(projectPath + "/ExcelFiles/EmailId2.xlsx");
//			workbook = workbook = new XSSFWorkbook("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Maven\\ExcelFiles\\EmailId2.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double abc = sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println("Cell Data is:"+abc);
		} 

		catch (Exception exp) 
		{
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		EmailUtil util = new EmailUtil();
		util.getrowcount();
		util.getCellDataString();
		util.getCellDataNumeric();
	}

}
