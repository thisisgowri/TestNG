package testngannotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BeforeAfterClass {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launched Chrome Browser");

	}

	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit Browser");
	}
}
