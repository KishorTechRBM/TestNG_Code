package Parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter {
	@Test
	@Parameters({"MyName"})
	public void test(@Optional("Kishor") String name) {
	  System.out.println("Name is:"+ name);
  }
}
