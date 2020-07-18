package MainPackage;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	@Test(invocationTimeOut=5000)
	public void infinitelooptest() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	
	
	
	
	}
	
	
	
	
}
