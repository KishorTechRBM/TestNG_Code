package dependency;

import org.testng.annotations.Test;

public class DependencybyGroup2 {
	@Test(dependsOnGroups = { "Sanity.*" })
	public void test1() {
		System.out.println("I am inside test1");
	}

	@Test(groups = { "Sanity1" })	
	public void test2() {
		System.out.println("I am inside test2");
	}

	@Test(groups = { "Sanity2" })
	public void test3() {
		System.out.println("I am inside test3");
	}
}
