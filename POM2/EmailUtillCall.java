package POM2;

public class EmailUtillCall {
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		EmailUtil2 util2 = new EmailUtil2(projectPath+"/ExcelFiles/EmailId2.xlsx", "Sheet1");
		util2.getrowcount();
		util2.getcolcount();
		util2.getCellDataString(0, 0);
		util2.getCellDataNumeric(1, 1);
	}

}
