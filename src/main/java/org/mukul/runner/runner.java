package org.mukul.runner;

import org.mukul.runInitilization.Hooks;

import io.cucumber.core.cli.Main;

public class runner 
{
	public static void run(){
		
		String tags="@tag1";
		
		String features=System.getProperty("user.dir")+"/src/test/resource/features/";
		String stepdef="classpath:org/mukul/stepDef";
		String hooks="classpath:org/mukul/runInitilization";
		Main.main(new String[]{features,"-g", stepdef,"-g",hooks,"-p","pretty",
				 "-p","html:target/cucumber-reports","-p","json:target/cucumber.json","-m",
				 "--monochrome","-t",tags});
    }
	
	
    public static void main(String[] args)
    {
    	String run_mode="";
    	if(args.length>0)
    		run_mode=args[0];
    	if(!run_mode.equals("JenkinsRun")){
    		Hooks.isRun=true;
    		run();
    	}else{
    		run();
    	}
    	
    }
}
