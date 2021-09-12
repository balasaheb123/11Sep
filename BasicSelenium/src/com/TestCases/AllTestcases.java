package com.TestCases;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTestcases {
	@Test
	public void TC01_ChackEmailError() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java_Matrials/Selenium%20JBKClass/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("vikram@gmail.com");
		String actErrMsg = driver.findElement(By.id("email_error")).getText();
		String expErrMsg = "Please enter email as kiran@gmail.com";
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.quit();
	}

	/*@Test
	public void testPasswordError1() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java_Matrials/Selenium%20JBKClass/Offline%20Website/Offline%20Website/index.html");
		driver.findElement(By.id("password")).sendKeys("cdccec");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actErrMsg = driver.findElement(By.id("password_error")).getText();
		String expErrMsg = "Please enter password.";
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.quit();
	}

	@Test
	public void testPasswordError2() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actErrMsg = driver.findElement(By.id("password_error")).getText();
		String expErrMsg = "Please enter password.";
		Assert.assertEquals(actErrMsg, expErrMsg);
		driver.quit();
	}

	@Test
	public void testLoginSuccessful() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String title =driver.getCurrentUrl();
		System.out.println(title);
		String actMsg = "file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html";
		Assert.assertEquals(actMsg, title);
		driver.quit();

	}

	@Test
	public void testTitle() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = "JavaByKiran | Dashboard";
		System.out.println(driver.getTitle());
		Assert.assertEquals(actErrMsg, driver.getTitle());

	}

	@Test
	public void test11() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/users.html");
		String actErrMsg = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).getText();
		String expErrMsg = "Add User";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test12() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).getText();
		String expErrMsg = "Users";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test13() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[4]/a/span")).getText();
		String expErrMsg = "Operators";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test14() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[5]/a/span")).getText();
		String expErrMsg = "Useful Links";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test15() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[6]/a/span")).getText();
		String expErrMsg = "Downloads";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test16() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[7]/a/span")).getText();
		String expErrMsg = "Logout";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test17() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/operators.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String expErrMsg = "Operators";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test18() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/links.html");
		String actMsg = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String expMsg = "Useful Links";
		Assert.assertEquals(actMsg, expMsg);
	}

	@Test
	public void test19() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/downloads.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
		String expErrMsg = "Downloads";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test20() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/dashboard.html");
		String actErrMsg = driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div[1]/div/div[1]/h3"))
				.getText();
		String expErrMsg = "Selenium";
		Assert.assertEquals(actErrMsg, expErrMsg);
	}

	@Test
	public void test21() {
		System.getProperty("webdrier.chrome.driver", "chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/vikram/Desktop/JBK%20software/Selenium%20Softwares/Offline%20Website/pages/examples/add_user.html");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kiran");
		driver.findElement(By.id("mobile")).sendKeys("123456");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("java");
		driver.findElement(By.id("Male")).click();

		/*WebElement wb = driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
		Select ss = new Select(wb); 
		ss.selectByIndex(1);*/
		
		/*Select select = new Select(driver.findElement(By.xpath(("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"))));
		select.selectByVisibleText("Maharashtra");
		select.selectByVisibleText("3");
		List<WebElement> a =select.getOptions();
		for(WebElement b:a){
			String c=b.getText();
			System.out.println(c);
		}
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();*/
		
		/*Alert alert = driver.switchTo().alert();
		String am = driver.switchTo().alert().getText();
		System.out.println(am);
		alert.accept();*/

	}
