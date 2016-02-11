package com.laus.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import cucumber.api.java.en.Given;

public class CukeSteps {

	@Given("i test cucumber")
	public void testCuke() throws Throwable{
		System.out.println("test cucumber complete");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("http://www.google.com");
		Screen s = new Screen();
        try{
                s.click("src/test/images/chrome.png");
                //s.wait("imgs/spotlight-input.png");
               // s.click();
                s.write("hello world#ENTER.");
        }
        catch(FindFailed e){
                e.printStackTrace();
        }
	}
}
