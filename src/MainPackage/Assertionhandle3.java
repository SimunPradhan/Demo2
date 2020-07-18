package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionhandle3 {
	
	@Test
	public void logintofacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//
		driver.get("https://www.facebook.com/");
		String Stitle=driver.getTitle();
		
		Assert.assertEquals(Stitle, "Facebook – log in or sign up","Title is not matching");
		
		//Assert.assertFalse(driver.findElement(By.xpath("//*[@id=\"email1\"]")).isDisplayed());
		
		driver.close();
		
	}
	
	
	
	

}
