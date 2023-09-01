package extra;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Runnerlistener
{
	@Test
	public void test1()
	{
		System.out.println("hello shivamogga");
	}
	@Test
	public void test2()
	{
		System.out.println("hello village");
		Assert.fail();
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("hello Formers");
	}
}
