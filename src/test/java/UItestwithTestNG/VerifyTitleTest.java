package UItestwithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	@Test
	public void TitleTest() {
		String expectedtitle= "Electronics, Cars,hghg Fashion, Collectibles & More | eBay";
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		String actualtitle= driver.getTitle();
		//Assert Method
		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
	}

}
