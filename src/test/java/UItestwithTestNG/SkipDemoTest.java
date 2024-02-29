package UItestwithTestNG;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	Boolean datasetup = false;
	@Test(enabled=false)
	public void skipTest1()
	{
		System.out.println("Skipping this test as it is not completed");
	}
	@Test
	public void skipTest2()
	{
		System.out.println("Skipping the test forcefully");
		throw new SkipException("Skipping the test");
	}
	@Test
	public void skipTest3()
	{
		System.out.println("Skipping this test based on condition");
		if(datasetup==true)
		{
			System.out.println("Execute the test");
		} 
		else {
			System.out.println("Do not execute the further test");
			throw new SkipException("Do not execute the further test");
			
		}
	}
}
