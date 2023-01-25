package POM2;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmailUtil2 {
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public EmailUtil2(String excelPath, String sheetName) {
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

	public static void getrowcount() {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows:" + rowCount);
	}
	
	public static void getcolcount() {
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Number of columns:" + colCount);
	}

	public static void getCellDataString(int rowNum, int colNum) {
		String abc = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("Cell Data is:" + abc);
	}

	public static void getCellDataNumeric(int rowNum, int colNum) {
		double abc = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("Cell Data is:" + abc);
	}

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		EmailUtil2 util2 = new EmailUtil2(projectPath+"/ExcelFiles/EmailId2.xlsx", "Sheet1");
		getrowcount();
		getcolcount();
		getCellDataString(0, 0);
		getCellDataNumeric(1, 1);
	}

}
