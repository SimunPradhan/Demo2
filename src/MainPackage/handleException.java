package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handleException {

	
	
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void testexception() throws InterruptedException {
		int i=9/0;
		Thread.sleep(3000);
		WebDriver driver = new ChromeDriver();
		System.out.println("exception handled");
		int a=10;
		System.out.println(a);
		
		
		
	}
	
	
	
	
	
}
