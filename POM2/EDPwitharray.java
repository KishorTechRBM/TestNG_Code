package POM2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EDPwitharray {
	public Object[][] displayData(String excelPath, String sheetName) {
		EmailUtil3 util3 = new EmailUtil3(excelPath, sheetName);
		int rowCount = util3.getrowcount();
		int colCount = util3.getcolcount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				String cellData = util3.getCellDataString(i, j);
				System.out.print(cellData + "|");
				data[i - 1][j] = cellData;
			}
			System.out.println();
		}
		return data;
	}

	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String projectPath = System.getProperty("user.dir");
		Object data[][] = displayData(projectPath + "/ExcelFiles/EmailId3.xlsx", "Sheet1");
		return data;
	}
	
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching chrome browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}

	@Test(dataProvider = "test1data")
	public void test(String username, String password) throws Exception {
		System.out.println(username + " |" + password);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
	}
	

}
