package extra;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner1class implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("tc exec Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc sucessfully exec");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("tc filed to exec");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped tc");
	}	
}
