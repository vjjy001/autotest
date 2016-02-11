package com.laus.autotest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin ={"pretty","html:target/html/"},  //output as html format report
		plugin ={"pretty","json:target/json/cukeTest.json"},  //output as html format report
		features ={"src/test/resources"}
		//plugin ={"pretty"}
		//format={"pretty"},
		//features ={"src/test/resources"}
		)
public class RunCukesTest {

	
	
}
