package testngannotations;

import org.testng.annotations.Test;

public class TestMethod extends BeforeAfterClass{

	@Test
	public void testLogin() {
		System.out.println("User logged in successfully");

	}

}
