package com.naukri.stepdefintion;
 
import java.sql.DriverManager;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;

import org.apache.logging.log4j.*;

import org.openqa.selenium.WebDriver;
import org.w3c.dom.DOMConfiguration;

import com.naukri.constants.Constants;
import com.naukri.utilties.CommonUtil;
import com.naukri.webdriver_manager.DriverManagerUserDefined;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class CommonStepdefinition {

////	public static Logger LOGGER= Log.getLogger(CommonStepdefinition.class.getName());
//	private Log log = LogFactory.getLog(CommonStepdefinition.class.getName());
	private static final Logger logger = LogManager.getLogger(CommonStepdefinition.class);
	
	
	@Before	
	public void BeforeScenario() {
	
		try {
			
			CommonUtil commonutils = new CommonUtil();
			commonutils.LoadProperties();
			logger.info("Test inf please");
			if(DriverManagerUserDefined.getDriver()==null) {
		     DriverManagerUserDefined.LaunchBrowser();
		    commonutils.intWebElement();
		     logger.info("driver launched successfully");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
