package com.qa.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*This class sets the value of driver */

public class selectBrowser {

	static WebDriver driver;

	public WebDriver selectBrowserdriver(String b) {

		if (b.trim().contains("Mozilla")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();

			driver.manage().window().maximize();
		} else if (b.trim().contains("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
		}

		return driver;
	}

}
