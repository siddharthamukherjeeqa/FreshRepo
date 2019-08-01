package listnerPackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;
public class CustomListeners3 implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		//when <Suite> tag starts
		System.out.println("onStart : before suite starts");
	}

	@Override
	public void onFinish(ISuite suite) {
		//when <Suite> tag completes
		System.out.println("onFinish : after suite completes");
	}


}
