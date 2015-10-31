package testcases;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testclasserrormessages {
	
	@Test
	public void errormessages() throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://gmail.com");
		driver.findElement(By.xpath("//*[@id='next']")).click();
		Thread.sleep(2000L);
		String	s1="Please enter your email.";
		String s=driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getText();	
		System.out.println("value= " + s);

Assert.assertEquals(s1,s);

driver.findElement(By.xpath("//*[@id='footer-list']/li[4]/a")).click();
Thread.sleep(2000L);
Set<String> ids=driver.getWindowHandles();
Iterator<String>it=ids.iterator();
String Parentid=it.next();
String childid=it.next();
driver.switchTo().window(childid);
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(Parentid);
System.out.println(driver.getTitle());
//Thread.sleep(5000L);
driver.close();
}	

}
