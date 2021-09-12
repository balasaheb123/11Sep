package com.Action_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;


public class Actionclass {
	WebDriver driver;

	@Test
	public void setup() {
		System.setProperty("webdriver.chrom.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		

	}
}
