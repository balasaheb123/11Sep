package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class PopupHandal {
	WebDriver driver;
	@Test
	public void test02() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		DesiredCapabilities dc= new DesiredCapabilities();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		//dc.setCapability(BrowserType.CHROME, opt);
		driver= new ChromeDriver(opt);
		driver.get("https://www.naukri.com/");
	}



				}


