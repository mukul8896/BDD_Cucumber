package org.mukul.runInitilization;


import java.util.Properties;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;

public class DriverUtils {
	private static ThreadLocal<DriverUtils> instance;
	private static ThreadLocal<WebDriver> driver;
	private static ThreadLocal<Properties> properties;
	private static ThreadLocal<JSONObject> pageData;
	
	public static DriverUtils getInstance() {
		return instance.get();
	}
	public static void setInstance(DriverUtils instance) {
		DriverUtils.instance.set(instance);
	}
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	public static void setDriver(WebDriver driver) {
		DriverUtils.driver.set(driver);;
	}
	public static Properties getProperties() {
		return properties.get();
	}
	public static void setProperties(Properties properties) {
		DriverUtils.properties.set(properties);
	}
	public static JSONObject getPageData() {
		return pageData.get();
	}
	public static void setPageData(JSONObject pageData) {
		DriverUtils.pageData.set(pageData);
	}	
	
}
