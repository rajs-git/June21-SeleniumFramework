package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test

	public void test3()	{
		System.out.println("This is test 3");
	}

	@Test

	public void test4() {
		System.out.println("Thisis test 4");
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
