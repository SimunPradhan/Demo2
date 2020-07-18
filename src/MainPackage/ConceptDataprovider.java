package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConceptDataprovider {
	
	
	@Test(dataProvider="getdata")
	public void test1(String username,String password) {
		
		System.out.println("username is " +username);
		System.out.println("password is " +password);
		System.out.println("Execution completd");
		
	}
	
	
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data = new Object[2][2];
		
		//1sr row
		data[0][0]= "admin";
		data[0][1]="admin1";
		
		
		data[1][0] = "admin2";
		data[1][1]="admin3";
		return data;
		
				
				
				
				
		
	}
	

}
