package dependency;

import org.testng.annotations.Test;

public class DependencybyMethod {
  @Test (dependsOnMethods = {"test2"}, priority=1 )
  public void test1() {
	  System.out.println("I am inside test1");
  }
  
  @Test(priority=2)
  public void test2() {
	  System.out.println("I am inside test2");
  }
  
  @Test(priority=3)
  public void test3() {
	  System.out.println("I am inside test3");
  }
}
