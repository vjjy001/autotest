package com.laus.autotest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This is cucumber Junit Test suit, is acting like run configuration 
 * 1. configure plugin to add the cucumber option 
 *   eg html:target/html -- output as html report
 *   eg json:target/json/cukeTest.json -- output as json file for later use
 * 2. configure feature to run all feature in the same folder or specific feature
 * 
 * @author JIAN_J
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin ={"pretty","html:target/html/"},  //output as html format report
		plugin ={"pretty","json:target/json/cukeTest.json"},  //output as html format report
		features ={"src/test/resources"},
		tags={"@testcuke"}  //only run testcuke sceniro
		//plugin ={"pretty"}
		//format={"pretty"},
		//features ={"src/test/resources"}
		)
public class RunCukesTest {

	
	
}
