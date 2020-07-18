package MainPackage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TypeofAssertion {
	
SoftAssert soft = new SoftAssert();
	@Test
	public void test1() {
		System.out.println("open browser");
		
		Assert.assertEquals(true, true);//hard assertion
		
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on sign in button");
		
		Assert.assertEquals(true, true);
		
		System.out.println("home page");
		
		soft.assertEquals(true, false);
		
		System.out.println("go to profile page");
		
		System.out.println("create profile");
		soft.assertEquals(true, false);
		
		soft.assertAll();
		
	}
	
	

}
