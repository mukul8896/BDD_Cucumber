package org.mks.applicationUtils;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import io.cucumber.core.api.Scenario;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.mks.runInitilization.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProjectUtils{
	public static void initializeDriver() {
		String browser=DriverUtils.getProperties().getProperty("browser").toLowerCase();
		WebDriver driver=null;

		switch (browser){
			case "chrome" :
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chrome" + File.separator + "chromedriver.exe");
				
				//WebdriversSession logic here to implementt driver according to capablities needed
				
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				break;

			case "ie" :
				break;
				
			case "remote" :
				
				//can use grid or other tools eg: Browserstack,
				break;
				
		}
		
		DriverUtils.setDriver(driver);
	}
	
	public static void loadProperties() {
		try {
			InputStream input = Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/test/resource/config.properties"));
            Properties prop = new Properties();
            prop.load(input);
            DriverUtils.setProperties(prop);
			input.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	public static void initializeData() {
		String scenarioName = DriverUtils.getScenario().getName();
		String featureName = DriverUtils.getScenario().getId().split(":")[1];
	
		String testDataFileName = featureName.replace("Test","Data").replace("feature","json");
		String env = DriverUtils.getProperties().getProperty("env");
		System.out.println("Env: "+ env);
		try {
			JSONParser parser = new JSONParser();
			JSONObject pageData = (JSONObject) parser.parse(new FileReader(System.getProperty("user.dir")+ File.separator + "src" + File.separator +"test" + File.separator + "resource" + File.separator + "testData" + File.separator + env + File.separator + testDataFileName));
			DriverUtils.setPageData((JSONObject) pageData.get(scenarioName));
		} catch (ParseException | IOException e) {
			System.out.println("Error: Could not initialize test data file");
			e.printStackTrace();
		}
	}


}
