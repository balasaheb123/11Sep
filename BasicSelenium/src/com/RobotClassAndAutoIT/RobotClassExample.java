package com.RobotClassAndAutoIT;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClassExample {
	// Declare global variable
	WebDriver driver;

	// Annotation for testing
	@Test
	public void Tc01() throws Exception {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// ChromeDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("file:///D:/Java_Matrials/Selenium%20JBKClass/Offline%20Website/Offline%20Website/index.html");
		// robot class will Write click on image but its not going directly so we use
		// action class
		Robot rob = new Robot();
		Actions act = new Actions(driver);
		// contextClick mens write click on image but imp perform method
		 act.contextClick(driver.findElement(By.tagName("img"))).perform();
		// now using robot class,keyboard key down work on automate
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		// using mouse operation click write left
		//rob.mousePress(KeyEvent.BUTTON3_DOWN_MASK);
		//rob.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
		driver.close();
	}

}