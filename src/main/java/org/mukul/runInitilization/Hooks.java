package org.mukul.runInitilization;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Hooks{
	public static boolean isRun=false;
	
	@Before(order = 0)
	public void beforeAll() {
		if(isRun){
			Runtime.getRuntime().addShutdownHook(new Thread(()->{
				System.out.println("mukul");
				Calendar date=Calendar.getInstance();
				String reportFolder=date.get(Calendar.DAY_OF_MONTH)+"_"+date.get(Calendar.MONTH)+"_"+date.get(Calendar.HOUR)+"_"+date.get(Calendar.MINUTE)+"_"+date.get(Calendar.SECOND);
				File outputDirectory=new File(System.getProperty("user.dir")+"/reports/"+reportFolder);
				if(!outputDirectory.exists())
					outputDirectory.mkdir();
				List<String> jsonFiles=new ArrayList<>();
				jsonFiles.add(System.getProperty("user.dir")+"/target/cucumber.json");
				Configuration config=new Configuration(outputDirectory, "bdd_cucumber");
				ReportBuilder builder=new ReportBuilder(jsonFiles, config);
				builder.generateReports();
			}));
			isRun=false;
		}	
	}
	
	@Before(order = 1)
	public void beforeScenario(Scenario scenario) {
		System.out.println(scenario.getSourceTagNames());
		System.out.println(scenario.getName());
	}
	
	@After
	public void beforeScenario() {
		System.out.println("close driver");
		//DriverUtils.getDriver().quit();
	}
	
}
