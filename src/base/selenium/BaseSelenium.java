package base.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import driverconfiguration.DriverOptions;

public class BaseSelenium extends DriverOptions {

	public void sendKeys(By element, String value) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(value);
	}

	public void sClick(By element) {
		driver.findElement(element).click();
	}

}
