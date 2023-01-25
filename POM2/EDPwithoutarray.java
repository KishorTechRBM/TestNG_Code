package POM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EDPwithoutarray {
	@Test
	public static void displayData(String excelPath, String sheetName) {
		EmailUtil3 util3 = new EmailUtil3(excelPath, sheetName);
		int rowCount = util3.getrowcount();
		int colCount = util3.getcolcount();

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = util3.getCellDataString(i, j);
				System.out.print(cellData + "|");
			}
			System.out.println();
		}
	}

	@DataProvider(name = "test1data")
	public void getData() {
		String projectPath = System.getProperty("user.dir");
		displayData(projectPath + "/ExcelFiles/EmailId3.xlsx", "Sheet1");
	}

	@Test
	public void test(String username, String password) throws Exception {
		System.out.println(username + " |" + password);
	}
}
