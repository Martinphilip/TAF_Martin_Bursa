package com.webapp.tests;


import com.webapp.helpers.TestCaseClass;
import com.automation.core.config.ProjectConfig;
import com.automation.core.driver.DriverFactory;
import com.automation.core.testng.BaseTest;
import com.automation.core.utils.reporter.Report;
import com.google.inject.Guice;
import com.google.inject.Injector;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllTests  extends BaseTest {
	
	
	@Test (dataProvider = "data-provider-props", dataProviderClass = DataProviderClass.class)
	public void RegistrationModule_DP_props(String displayName, String email,String password ) throws InterruptedException, IOException {
		TestCaseClass.registrationValidation(displayName,email,password);
	}

	@Parameters({ "testCaseID", "dataSheet" })
	@Test (dataProvider = "data-provider-xls", dataProviderClass = DataProviderClass.class )
	public void RegistrationModule_DP_xls( String displayName, String email,String password ) throws InterruptedException, IOException {
		
		TestCaseClass.registrationValidation(displayName,email,password);
	}


   	
}
