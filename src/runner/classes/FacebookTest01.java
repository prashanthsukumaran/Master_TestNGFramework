package runner.classes;

import org.testng.annotations.Test;

import business.components.FacebookLogin;

public class FacebookTest01 extends FacebookLogin{
	@Test
	public void fbLoginTest()
	{
		sFacebookLogin();
	}

}
