package UItestwithTestNG;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DataProviderDemoTest2 {
	
	@Test(dataProvider="create")
	public void test(String username, String password)
	{
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	@DataProvider(name="create")
	
	public Object[][] dataset1() 
	{
		return new Object[][]
			{
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			};
		
	}
	
}
