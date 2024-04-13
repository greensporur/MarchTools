package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features ="C:\\Users\\admin\\eclipse-workspace\\API_Project\\src\\test\\java\\com\\featurefile\\Tools.feature",
		
		glue = "C:\\Users\\admin\\eclipse-workspace\\API_Project\\src\\test\\java\\com\\stepdefinition\\ToolsStepDef.java",
		
		dryRun = true
		
		
		)

public class Runner {
	
	
	public static void  setUp(){
		
		System.out.println("Set up");
		
	}
	
	
	public static void tearDown() {
		
		System.out.println("Tear Down");
		
		
	}
	
	

}
