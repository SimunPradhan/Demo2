package MainPackage;

//import java.io.File;
import java.io.File;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*Before Suite: set system property for chrome
Before Test : login to application
Before Class: Launch chrome browser
Before Method: enter url
Test : Facebook title test
After Method: log out from application
After Class: close the browser
After Test : Cookies deletion*/






public class FirstTest {
	//before : precondition 
	//@test : test cases: functionality which we need to test
	//after: post condition
    @BeforeSuite
	public void setup() {
		System.out.println("Before Suite: set system property for chrome");
	}
    
    @BeforeTest
    public void login() {
    	System.out.println("Before Test : login to application");
    }
	
    @BeforeClass
    public void launchBrowser() {
    	System.out.println("Before Class: Launch chrome browser");
    }
    
   
	
    
    @BeforeMethod
    public void enterUrl() {
    	System.out.println("Before Method: enter url");
    }
    
    @Test
    public void testFacebooktitle() {
    	try {
			System.out.println("Test : Facebook title test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	 finally {
    			System.out.println("Test execution is completd");
    		}
    	
    	
    }
    @AfterMethod
    public void logout() {
    	System.out.println("After Method: log out from application");
    	
    }
    
   
    
    
    @AfterClass
    public void closebrowser() {
    	System.out.println("After Class: close the browser");
    }
    
    @AfterTest
    public void deletecookies() {
    	System.out.println("After Test : Cookies deletion");
    }
	
    
    
    
    @AfterSuite
    public void testcomplete() {
    	System.out.println("After Suite: Test is completed");
    }
	
	

	}
