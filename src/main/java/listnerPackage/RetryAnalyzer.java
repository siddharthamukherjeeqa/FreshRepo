package listnerPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryAnalyzer implements IRetryAnalyzer{

	private int retrycount =0;
	private int maxretrycount = 3;
	@Override
	public boolean retry(ITestResult result) {
		if(result.isSuccess()) {
			
		}else {
			if (retrycount < maxretrycount) {
				System.out.println("Retrying " + result.getName() + " again and the count is " + (retrycount+1));
				retrycount++;
				return true;
			}	
		}
			
	return false;
	}
}
