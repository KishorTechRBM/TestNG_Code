package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNG_listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("****Test started :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("****Test is successful :"+result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("****Test failed :"+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("****Test skipped :"+result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("****Tests finished :"+context.getName());

	}
}
