package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclass1 {
//private static final WebDriver NULL = null;
public static WebDriver driver=null;
//=new FirefoxDriver();
	@BeforeClass
	public static void Logging()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		
		System.out.println("LOGGING");
	}
	@Test
	public void LoginProcessTest()
	{
	System.out.println("printing method1");
		
	}
	
	@Test
	public void LoginInProcessTest()
	{
	System.out.println("In processing");
		
	}
	@Test
	public void Logout()
	{
		driver.close();
	}
	@AfterClass
	public static void Logoutcheck()
	{
		//driver.close();
		System.out.println("I am end of the test");
			}
	
}
