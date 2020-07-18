package MainPackage;

import org.testng.annotations.Test;

public class Testngfeatures {
	
	
	
	
	@Test
	public void loginTest() {
		System.out.println("login method");
		int i= 9/0;
		
		
	}
	
	
	@Test(dependsOnMethods="loginTest")
	public void Homepage() {
		System.out.println("home page test");
	}
	
	
	@Test
	public void profiletest() {
		System.out.println("profile test");
	}
	
	

	
	
	
	
	

}
