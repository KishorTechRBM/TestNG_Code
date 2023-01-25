package POM2;

public class ExcelDataProvider {
	
	public static void  displayData(String excelPath, String sheetName) {
		EmailUtil3 util3 = new EmailUtil3(excelPath, sheetName);
		int rowCount = util3.getrowcount();
		int colCount = util3.getcolcount();
		
		for(int i=0; i<rowCount; i++) {
			for (int j=0; j<colCount; j++) {
				String cellData = util3.getCellDataString(i, j);
				System.out.print(cellData+ "|");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		displayData(projectPath+"/ExcelFiles/EmailId3.xlsx", "Sheet1");
	}

}
