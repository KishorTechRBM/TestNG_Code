package POM2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Email {
	WebDriver driver = new ChromeDriver();
	String URL = "https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1";

	@Test
	void launch_browser() {
		for (int a = 1; a <= 100; a++) {
			driver.get(URL);

			try {
				// Specify the path of file
				File src = new File("C:\\\\Users\\\\Admin\\\\Downloads\\\\Email Id.xlsx");

				// load file
				FileInputStream fis = new FileInputStream(src);

				// Load workbook
				XSSFWorkbook wb = new XSSFWorkbook(fis);

				// Load sheet- Here we are loading first sheetonly
				XSSFSheet sh1 = wb.getSheetAt(0);

				// and getCell() specify which column to read.
				// getStringCellValue() specify that we are reading String data.

				for (int i = 0; i <= 100; i++) {
					for (int j = 2; j == 2;) {
						String abc = sh1.getRow(i).getCell(j).getStringCellValue();
						System.out.println(abc);
						WebElement ap_email = driver.findElement(By.id("ap_email"));
						ap_email.clear();
						ap_email.sendKeys(abc);
						driver.findElement(By.id("continue")).click();

						WebElement ap_password = driver.findElement(By.id("ap_password"));
						ap_password.clear();
						ap_password.sendKeys("01@Amazon");
						driver.findElement(By.id("signInSubmit")).click();
						break;
					}
				}
			} catch (IOException e) {
				// ... handle errors ...
			} finally {
				// ... cleanup that will execute whether or not an error occurred ...
			}
			System.out.println(a + " " + "Loop completed");
		}
	}
}
