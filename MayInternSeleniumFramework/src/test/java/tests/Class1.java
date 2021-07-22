package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test(groups= {"Sanity"})
	public void test1()	{
		System.out.println("This is test 1");
	}

	@Test(groups= {"Regression"})
	public void test2()	{
		System.out.println("This is test 2");
	}

	@BeforeClass
	public void beforeclass()	{
		System.out.println("This will be executed in class2");
	}

	@BeforeTest
	public void beforetest()	{
		System.out.println("This will be executed in class1 and class2 tests are executed");
	}

	@BeforeSuite

	public void beforetestsuite() {
		System.out.println("This will be executed before the test suite is executed");
	}

	@BeforeMethod
	public void beforemethod()	{
		System.out.println("******Before every test**********");
	}
}
