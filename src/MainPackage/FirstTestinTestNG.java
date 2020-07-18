package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestinTestNG {
	
	/*// Broswe launched
	//user able to login to the application
	User able to get title of the page
	Browser is closed
	Test execution is completed*/
	
	
	
	 //WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		//driver = new ChromeDriver();
		
		System.out.println("Broswer launched");
		System.out.println("user able to login to the application");
	}
	
	
	@Test(priority=1,groups="Title")
	public void getTitle() {
		System.out.println("User able to get title of the page");
	}
	
	@Test(priority=1,groups="Title")
	public void getTitle2() {
		System.out.println("User able to get title of the page");
	}
	
	@Test(priority=1,groups="Title")
	public void getTitle3() {
		System.out.println("User able to get title of the page");
	}
	
	
	@Test(priority=2,groups="Homepage")
	public void validateHomepage() {
		System.out.println("user is now on home page");
	}
	
	
	@Test(priority=2,groups="Homepage")
	public void validateHomepage2() {
		System.out.println("user is now on home page");
	}
	@Test(priority=2,groups="Homepage")
	public void validateHomepage3() {
		System.out.println("user is now on home page");
	}
	
	
	
	
	
	
	
	
	@Test(priority=3,groups="profile")
	public void clickonprofilebutton() {
		System.out.println("user landed on profile page");
	}
	
	
	@Test(priority=3,groups="profile")
	public void clickonprofilebutton2() {
		System.out.println("user landed on profile page");
	}
	
	@Test(priority=3,groups="profile")
	public void clickonprofilebutton3() {
		System.out.println("user landed on profile page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown() {
		System.out.println("Browser is closed");
		System.out.println("Test execution is completed");
	}
	
	
	

}
