package testngannotations;

import org.testng.annotations.BeforeClass;

public class BeforeClassMethod {

	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launched Chrome Browser");

	}

}
