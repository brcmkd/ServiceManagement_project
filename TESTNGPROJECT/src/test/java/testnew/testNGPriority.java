package testnew;

import org.testng.annotations.Test;

public class testNGPriority {
	@Test(priority=2,groups="Regression")
	
	public void googleTitleTest()
	{
		System.out.println("test1");
	}
@Test(priority=1,groups="Regression")
	
	public void googleurlTest()
	{
		System.out.println("test2");
	}
@Test(priority=3,groups="sanity")

public void searchBoxlTest()
{
	System.out.println("serch box");
}
}
