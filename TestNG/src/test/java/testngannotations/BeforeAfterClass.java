package testngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launched Chrome Browser");

	}

	@Test
	public void testLogin() {
		System.out.println("User logged in successfully");

	}

	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit Browser");
	}
}
