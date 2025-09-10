package testngannotations;

import org.testng.annotations.AfterClass;

public class AfterClassMethod {

	@AfterClass
	public void quitBrowser() {
		System.out.println("Quit Browser");
	}

}
