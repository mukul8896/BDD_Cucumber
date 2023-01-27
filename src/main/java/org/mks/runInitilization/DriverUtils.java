package org.mks.runInitilization;


import java.util.Properties;

import io.cucumber.core.api.Scenario;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;

public class DriverUtils {
	private static ThreadLocal<WebDriver> driver;
	private static ThreadLocal<Properties> properties;
	private static ThreadLocal<JSONObject> pageData;
	private static ThreadLocal<Scenario> scenario;

	public static Scenario getScenario() {
		return scenario.get();
	}

	public static void setScenario(Scenario value) {
		scenario = new ThreadLocal<>();
		DriverUtils.scenario.set(value);
	}

	public static WebDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(WebDriver value) {
		driver = new ThreadLocal<>();
		DriverUtils.driver.set(value);
	}
	public static Properties getProperties() {
		return properties.get();
	}

	public static void setProperties(Properties value) {
		properties = new ThreadLocal<>();
		properties.set(value);
	}

	public static JSONObject getPageData() {
		return pageData.get();
	}

	public static void setPageData(JSONObject value) {
		pageData = new ThreadLocal<>();
		pageData.set(value);
	}

}
