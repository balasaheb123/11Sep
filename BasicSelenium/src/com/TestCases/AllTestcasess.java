package com.TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AllTestcasess {
	WebDriver driver;

	@BeforeSuite
	public void TC_01_setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/index.html");
		driver.manage().window().maximize();

	}

	@Test(priority = 0)
	public void TC_02VerifyLoginPageTitle() {

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");

	}

	@Test(priority = 1)
	public void TC_03VerifyloginPageLogo() {
		WebElement logo = driver.findElement(By.xpath("//img[@src='pages/images/jbk.png']"));// tagname
		Assert.assertTrue(logo.isDisplayed());

	}

	@Test(priority = 2)
	public void TC_04Verify_url() {
		Assert.assertEquals(driver.getCurrentUrl(), "file:///D:/Offline%20Website/index.html");
	}

	@Test(priority = 3)
	public void TC_05verifyheader() {
		String ActualHeader = driver.findElement(By.xpath("//b[text()='Java By Kiran']")).getText();
		String ExpectedHeader = "Java By Kiran";
		Assert.assertEquals(ActualHeader, ExpectedHeader);
	}

	@Test(priority = 4)
	public void TC_06verifySubheader() {
		String ActualHeader = driver.findElement(By.xpath("//h4[text()='JAVA | SELENIUM | PYTHON']")).getText();
		String ExpectedHeader = "JAVA | SELENIUM | PYTHON";
		Assert.assertEquals(ActualHeader, ExpectedHeader);
	}

	@Test(priority = 5)
	public void TC_07Verifloginboxmsg() {
		WebElement actualText = driver.findElement(By.xpath("//p[@class='login-box-msg']"));
		Assert.assertEquals(actualText.getText(), "Sign in to start your session");
	}

	@Test(priority = 6)
	public void TC_08chack_emailErrorMsg() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String ActualErrorMsg = driver.findElement(By.id("email_error")).getText();
		String ExpectedErrorMsg = "Please enter email.";
		Assert.assertEquals(ActualErrorMsg, ExpectedErrorMsg);
	}

	@Test(priority = 7)
	public void TC_09chack_PassErrorMsg() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String ActualEmailMsg = driver.findElement(By.id("password_error")).getText();
		String ExpectedEmailMsg = "Please enter password.";
		Assert.assertEquals(ActualEmailMsg, ExpectedEmailMsg);
	}

	@Test(priority = 8)
	public void TC_10verifyEmail_eroor() {
		driver.findElement(By.id("email")).sendKeys("bhhdb");
		driver.findElement(By.id("password")).sendKeys("494984");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Actualtext = driver.findElement(By.xpath("//div[@id='email_error']")).getText();
		String ExpectedText = "Please enter email as kiran@gmail.com";
		Assert.assertEquals(Actualtext, ExpectedText);
		// Assert.assertEquals(Actualtext, "Please enter email as kiran@gmail.com");
	}

	@Test(priority = 9)
	public void TC_11_verify_PasswordError() {
		driver.findElement(By.id("email")).sendKeys("fdd");
		driver.findElement(By.id("password")).sendKeys("fudgfd");
		String Atual = driver.findElement(By.xpath("//div[@id='password_error']")).getText();
		String expect = "Please enter password 123456";
		Assert.assertEquals(Atual, expect);
	}

	@Test(priority = 10)
	public void TC_12_verify_Sign_Text() {
		String actualText = driver.findElement(By.xpath("//button[@type='submit']")).getText();
		String ExpecteText = "Sign In";
		Assert.assertEquals(actualText, ExpecteText);
	}

	@Test(priority = 11)
	public void TC_13_VerifReg_btn_clik() {
		String actualText = driver.findElement(By.xpath("//a[@class='text-center']")).getText();
		String ExpectedText = "Register a new membership";
		Assert.assertEquals(actualText, ExpectedText);
	}

	@Test(priority = 12)
	public void verify_Register_New_Member() {
		driver.findElement(By.xpath("//a[@class='text-center']")).click();
		driver.findElement(By.id("name")).sendKeys("bala");
		driver.findElement(By.id("mobile")).sendKeys("7507763885");
		driver.findElement(By.id("email")).sendKeys("bala@gmail.com");
		driver.findElement(By.id("password")).sendKeys("pass123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actual = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		Assert.assertEquals(actual, "User registered successfully.");
	}


@Test(priority = 2)
public void Verify_DashbordTitlr02() {
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
}
@Test(priority=1)
public void verifyUrl()
{
	Assert.assertEquals(driver.getCurrentUrl(),"file:///D:/Offline%20Website/pages/examples/dashboard.html");
}


@Test(priority = 3)
public void Verify_Dashbord_List() {
	ArrayList<String> expectedList = new ArrayList<>();
	expectedList.add("Dashboard");
	expectedList.add("Users");
	expectedList.add("Operators");
	expectedList.add("Useful Links");
	expectedList.add("Downloads");
	expectedList.add("Logout");
	
	List<WebElement> menulist = driver.findElements(By.xpath("//li//span"));
	ArrayList<String> actuallist = new ArrayList<String>();
	for (WebElement menu : menulist) {
		String text = menu.getText();
		actuallist.add(text);
	}
	System.out.println(actuallist);
	Assert.assertEquals(actuallist, expectedList);
}

@Test(priority = 4)
public void VerifyCourses() {
	ArrayList<String> expectedcourse = new ArrayList<String>();
	expectedcourse.add("Selenium");
	expectedcourse.add("Java / J2EE");
	expectedcourse.add("Python");
	expectedcourse.add("Php");

	List<WebElement> courses = driver.findElements(By.xpath("//h3"));
	ArrayList<String> actualcourse = new ArrayList<>();
	for (WebElement cours : courses) {
		String text = cours.getText();
		actualcourse.add(text);
	}
	System.out.println(actualcourse);
	Assert.assertEquals(actualcourse, expectedcourse);
}

@Test(priority = 5)
public void VerifyBG_color() {
	ArrayList<String> expectedColore = new ArrayList<String>();
	expectedColore.add("aqua");
	expectedColore.add("green");
	expectedColore.add("yellow");
	expectedColore.add("red");

	ArrayList<String> ActualColore = new ArrayList<String>();
	List<WebElement> courses = driver.findElements(By.xpath("//div[contains(@class,'small-box')]"));
	for (WebElement course : courses) {
		String value = course.getAttribute("class");// small-box bg-aqua
		String coloure = value.substring(value.lastIndexOf("-") + 1);
		ActualColore.add(coloure);
	}
	System.out.println(ActualColore);
	Assert.assertEquals(ActualColore, expectedColore);
	

}

	@AfterSuite
	public void TearDowen() {
		driver.close();
	}

}
