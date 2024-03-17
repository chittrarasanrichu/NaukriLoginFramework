package com.naukri.utilties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.support.PageFactory;

import com.naukri.constants.Constants;
import com.naukri.page_object.LoginPage;
import com.naukri.webdriver_manager.DriverManagerUserDefined;

public class CommonUtil {
	public void LoadProperties() {
				
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Constants.APP_URL=properties.getProperty("APP_URL");
		Constants.BROWSER=properties.getProperty("BROWSER");
		Constants.UserName=properties.getProperty("UserName");
		Constants.Password=properties.getProperty("Password");
	}
	public void intWebElement() {
		PageFactory.initElements(DriverManagerUserDefined.getDriver(), LoginPage.class);
	}

}
