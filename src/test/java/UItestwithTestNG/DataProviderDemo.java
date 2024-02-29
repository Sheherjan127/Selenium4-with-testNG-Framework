package UItestwithTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider="dataset")
	public void test(String username, String password)
	
	{
		System.out.println(username+"======"+password);
	}
	
	@Test(dataProvider="dataset1")
	
	public void test1(String username, String password, String test )
	{
		System.out.println(username+"======"+password+"====="+test);
	}
	@DataProvider
	
	public Object[][] dataset1() 
	{
		return new Object[][]
			{
			{"username","password","test"},
			{"username1","password1","test1"},
			{"username2","password2","test2"},
			{"username3","password3","test3"},
			};
		
	}
	
	//Or 
	
	@DataProvider
	
	public Object[][] dataset() 
	{
		Object[][] dataset= new Object[4][2];
		
		//First row
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
		
		//Second row
		dataset[1][0]="user2";
	    dataset[1][1]="pass2";
	    
	    //Third row
	    dataset[2][0]="user3";
	    dataset[2][1]="pass3";
	    
	    //Forth row
	    dataset[3][0]="user4";
	    dataset[3][1]="pass4";
	    
	    return dataset;
	}
	
	
}
