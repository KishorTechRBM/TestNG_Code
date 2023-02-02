package GroupTestNG;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = { "smoke" })
	public void Test1() {
		System.out.println("I am in Test1");
	}

	@Test(groups = { "sanity" })
	public void Test2() {
		System.out.println("I am in Test2");
	}

	@Test(groups = { "smoke", "regression" })
	public void Test3() {
		System.out.println("I am in Test3");
	}

	@Test(groups = { "regression" })
	public void Test4() {
		System.out.println("I am in Test4");
	}

	@Test(groups = { "windows.regression" })
	public void Test5() {
		System.out.println("I am in Test5");
	}
	
	@Test(groups = { "linux.regression" })
	public void Test6() {
		System.out.println("I am in Test6");
	}
	
	public void Test7() {
		System.out.println("I am in Test7");
	}
}
