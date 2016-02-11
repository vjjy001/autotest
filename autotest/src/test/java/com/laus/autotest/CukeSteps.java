package com.laus.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;

public class CukeSteps {

	@Given("i test cucumber")
	public void testCuke() throws Throwable{
		System.out.println("test cucumber complete");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
	}
}
