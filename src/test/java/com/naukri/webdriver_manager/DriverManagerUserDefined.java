package com.naukri.webdriver_manager;

import org.openqa.selenium.WebDriver;

import com.naukri.constants.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManagerUserDefined {
	
	private static WebDriver driver = null;
	
	

	public static void LaunchBrowser() {
		try {
			switch (Constants.BROWSER) {
			case "Chrome":
				driver = WebDriverManager.chromedriver().create();
				break;
			case "edge":
				driver = WebDriverManager.edgedriver().create();
				break;

			default:
				driver = WebDriverManager.chromedriver().create();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}
	public static WebDriver getDriver() {
		return driver;
	}
}

