package com.BG_ColoreChack;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class BG_Chack {
	WebDriver driver;
	@Test
	public void TC_01() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("file:///D:/Java_Matrials/Selenium%20JBKClass/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("html/body/div/div[2]/form/div[3]/div/button")).click();

		ArrayList<String> expectedColore = new ArrayList<String>();
		expectedColore.add("aqua");
		expectedColore.add("green");
		expectedColore.add("yellow");
		expectedColore.add("red");

		ArrayList<String> ActualColore = new ArrayList<String>();
		List<WebElement> courses = driver.findElements(By.xpath("//div[contains(@class,'small-box')]"));
		for (WebElement course : courses) {
			String value = course.getAttribute("class");//small-box bg-aqua
			String coloure = value.substring(value.lastIndexOf("-") + 1);
			ActualColore.add(coloure);
		}

		System.out.println(ActualColore);
		Assert.assertEquals(ActualColore, expectedColore);

	}
}
