package UItestwithTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void connectToDB()
	{
		System.out.println("DB connected");
	}
	
	@AfterTest
	public void disconnectToDB()
	{
		System.out.println("Disconnect DB connected");
	}
	@Test(priority=1, description="this is the login test")
	public void loginTest() {
		
		System.out.println("Passed");
	}
	
	@Test(priority=2, description="this is the logout test")
public void logoutTest() { 
		
		System.out.println("Passed");
	}
}