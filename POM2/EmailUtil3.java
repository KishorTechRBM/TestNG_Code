package POM2;

import javax.sound.sampled.AudioSystem;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmailUtil3 {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public EmailUtil3(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}

	public static int getrowcount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of row is:"+rowCount);
		return rowCount;
	}
	
	public static int getcolcount() {
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Total number of column is:"+colCount);
		return colCount;
	}

	public static String getCellDataString(int rowNum, int colNum) {
		String abc = null;
		abc = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
//		System.out.println("Cell Data is:" + abc);
		return abc;
	}

	public static void getCellDataNumeric(int rowNum, int colNum) {
		double abc = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
//		System.out.println("Cell Data is:" + abc);
	}
	
/*
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		EmailUtil3 util3 = new EmailUtil3(projectPath+"/ExcelFiles/EmailId2.xlsx", "Sheet1");
		getrowcount();
		getcolcount();
		getCellDataString(0, 0);
		getCellDataNumeric(1, 1);
	}
	*/


}
