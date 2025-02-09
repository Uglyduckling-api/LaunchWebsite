package com.qa.launch;

import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class testRunner {
  

@Test 
@Parameters("browser")
  public void TestCase1(String browser) {
	  
	  System.out.println("Method Called to launch website");
	  try {
		launchSite.Searchpython(browser);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("Method Called Successfully");
	  
  }
}
