package Common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	@BeforeSuite
	public void dataSetup()
	{
		System.out.println("Common data setup");
		//datasoft//datasoft//common data setup;
		//@before
	}
	@AfterSuite
	public void dataTeardown()
	{
		System.out.println("Common data cleanup");
		System.out.println();
		//system.out.println();
		
	}

}
