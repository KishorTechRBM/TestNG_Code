package priority;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Return;

// @Listeners(listeners.TestNG_listeners.class)
public class Priority1 {
	WebDriver driver;

	@Test(priority = 1)
	public void test1() {
		System.out.println("I am inside test1");
		System.out.println("Launching Chrome Browser...");
		driver = new ChromeDriver();
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("I am inside test2");
		driver.manage().window().maximize();
		driver.get("http://www.google.co.in");
	}

	@Test(priority = 3)
	public void test3() {
		System.out.println("I am inside test3");
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("Facebook");
		driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys(Keys.ENTER);
	}
	
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		System.out.println("I am inside test4");
		Thread.sleep(3000);		
        Assert.assertEquals(driver.getTitle().contains("Facebook - Google Search"), true);	
	}
	
	
}
