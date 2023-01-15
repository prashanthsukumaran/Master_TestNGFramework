package driverconfiguration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DriverOptions {
	public static WebDriver driver;

	@BeforeSuite
	public void driverSetup() throws IOException {
		String projectPath = System.getProperty("user.dir");
		Properties properties;
		InputStream inputFile;
		inputFile = new FileInputStream(projectPath + "/util_files/Configuration.properties");
		properties = new Properties();
		properties.load(inputFile);
		System.out.println(properties.getProperty("driver"));
		switch (properties.getProperty("driver")) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(properties.getProperty("url"));
			break;
		}

	}

	@AfterSuite
	public void driverQuit() {
		driver.quit();
	}

}
