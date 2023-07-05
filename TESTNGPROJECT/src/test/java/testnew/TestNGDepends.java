package testnew;

import org.testng.annotations.Test;

public class TestNGDepends {

	@Test
	public void loginTest()
	{
		System.out.println("login");
		int i=100/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest()
	{
		System.out.println("homepage");
	}
}
