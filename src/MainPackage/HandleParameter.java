package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandleParameter {
	
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url", "username","password"})
	public void testwithparameter(String browser,String url,String username,String password) {
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys(username);
		
		
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys(password);
		
		
		
	}
	
	
	
	

}
