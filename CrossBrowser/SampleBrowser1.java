package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SampleBrowser1 {
	WebDriver driver = null;
	String url = "https://www.google.com/";
	String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is :" + browserName);
		System.out.println("Thread is:"+ Thread.currentThread().getId());
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Test successfully run on chrome");
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Test successfully run on firefox");
		}

		else if (browserName.equalsIgnoreCase("MS_Edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			System.out.println("Test successfully run on MS_Edge");
		}
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}

