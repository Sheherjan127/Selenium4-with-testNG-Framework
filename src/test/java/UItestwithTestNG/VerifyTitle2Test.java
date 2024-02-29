package UItestwithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle2Test {
    @Test
	public void TitleTest() {
    	SoftAssert softassert= new SoftAssert();
		String expectedtitle= "Electronics, Cars,Fashion, Collectibles & More | eBay";
		String expectedtext="search";
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		String actualtitle= driver.getTitle();
		softassert.assertEquals(actualtitle, expectedtitle, "title verification failed");
		System.out.println("verifying title");
		//Assert Method
		String actualtext= driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("verifying text");
		
		softassert.assertEquals(actualtext, expectedtext, "text verification failed");
		System.out.println("Browser close");
		driver.close();
		driver.close();
		
		
	}

}

