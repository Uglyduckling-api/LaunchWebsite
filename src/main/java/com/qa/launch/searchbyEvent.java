package com.qa.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*This class is determines the page object of the webpage 
 * and performs operation on the object
 */

public class searchbyEvent {

	private WebDriver driver;

	@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div[1]/div[2]/input")
	WebElement searchbox;

	public searchbyEvent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void searchevent() throws InterruptedException {
		this.searchbox.sendKeys("python");

		this.searchbox.click();
		Thread.sleep(500);
	}

}
