package CrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (browserName.equalsIgnoreCase("internet_explorer")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/msedgedriver.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get(url);
		Thread.sleep(5000);
	}
}
