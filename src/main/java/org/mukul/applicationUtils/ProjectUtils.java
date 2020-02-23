package org.mukul.applicationUtils;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.mukul.runInitilization.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectUtils{
	public void initializeDriver() {
		String browser=DriverUtils.getProperties().getProperty("Browser");
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			 
			// Initialize browser
			driver=new ChromeDriver();
			 
			// Maximize browser
			driver.manage().window().maximize();
			
		}
		DriverUtils.setDriver(driver);
	}
	
	public void loadProperties() {
		try {
			InputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Settings.properties");
            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println("Browser:"+prop.getProperty("Browser"));
            
            input.close();
            DriverUtils.setProperties(prop);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	public void initializeData() {
		
	}
}
