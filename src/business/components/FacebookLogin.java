package business.components;

import org.openqa.selenium.By;

import base.selenium.BaseSelenium;

public class FacebookLogin extends BaseSelenium {
	By email = By.xpath("//input[@name='email']");
	By password = By.xpath("//input[@name='pass']");
	By button = By.xpath("//button[@name='login']");

	public void sFacebookLogin() {

		sendKeys(email, "abc@gmail.com");
		sendKeys(password, "1234");
		sClick(button);
	}

}
