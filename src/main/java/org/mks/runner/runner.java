package org.mks.runner;

import java.util.List;

import org.junit.runner.RunWith;
import org.mks.runInitilization.Hooks;
import io.cucumber.core.cli.Main;

public class runner
{
	public static void runTest(){
		String tags="@planitassignment";
		
		String features=System.getProperty("user.dir")+"/src/test/resource/features/";
		String stepdef="classpath:org/mks/stepDef";
		String hooks="classpath:org/mks/runInitilization";

		Main.main(new String[]{features,"-g", stepdef,"-g",hooks,
				 "-p","html:target/cucumber-reports","-p","json:target/cucumber.json",
				 "-t",tags});
    }
	
    public static void main(String[] args)
    {
    	// JenkinsRun / local
    	String run_mode="";
    	if(args.length>0)
    		run_mode=args[0];

    	if(!run_mode.equals("JenkinsRun")){
    		Hooks.isLocalReportRun=true;
    		runTest();
    	}else{
    		runTest();
    	}
    }
}
