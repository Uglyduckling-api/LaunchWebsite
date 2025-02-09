package com.qa.launch;

import org.openqa.selenium.WebDriver;

//This class is to verify that website launched and leaded successfully
public class launchSite {


	public static void Searchpython(String browser) {
		String br = browser;
		WebDriver dr;
		selectBrowser sb = new selectBrowser();
		dr = sb.selectBrowserdriver(br);
		dr.get("https://www.geeksforgeeks.org/");

		searchbyEvent searchbyEvent = new searchbyEvent(dr);
		try {
			searchbyEvent.searchevent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//To handle socket error
		if (br=="Mozilla") {
			dr.close();
		}else dr.quit();
		
		
	}
}
