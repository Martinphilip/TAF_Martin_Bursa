package com.webapp.helpers;


import com.webapp.pages.*;
import com.automation.core.config.ProjectConfig;
import com.automation.core.utils.data.ExcelDataReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import junit.framework.Assert;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCaseClass {
	
	public static void registrationValidation( String Name, String email,String pass) {
		// TODO Auto-generated method stub
				
		Assert.assertTrue(RegistrationPage.loginValidation(Name,email,pass));
	
	}

	
	
}
