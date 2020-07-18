package MainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dataproperty  {
	WebDriver driver;
	
	
	@Test
	public void handlepropertyfile() throws FileNotFoundException,IOException {
		
		Properties pr = new Properties();
		File file = new File(System.getProperty("user.dir")+"/config.properties");
		
		FileInputStream input = new FileInputStream(file);
		pr.load(input);
		
		System.out.println(pr.getProperty("browser"));
		System.out.println(pr.getProperty("url"));
		System.out.println(pr.getProperty("username"));
		System.out.println(pr.getProperty("password"));
		String username= pr.getProperty("username");
		String password= pr.getProperty("password");
		String url= pr.getProperty("url");
		
		String browser=pr.getProperty("browser");
		
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
		driver.get(pr.getProperty("url"));
		
		
		
		driver.findElement(By.xpath(pr.getProperty("firstName"))).clear();
		driver.findElement(By.xpath(pr.getProperty("firstName"))).sendKeys(username);
		
		driver.findElement(By.xpath(pr.getProperty("lastName"))).clear();
		driver.findElement(By.xpath(pr.getProperty("lastName"))).sendKeys(password);
		
		
		
		
	}
}

	
	
	


