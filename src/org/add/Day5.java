package org.add;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day5 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Justin Royan\\eclipse-workspace\\SeleniumDay2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//div[@id='heading2011']"));
		frame.click();
		
//		Actions  actions=new Actions(driver);
//		
//		WebElement modelResume = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
//		actions.contextClick(modelResume).perform();
//		
//		Robot robot=new Robot();
//		
//		for (int i = 1; i <=8; i++) {
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//		}
//		
//		robot.keyPress(KeyEvent.VK_ENTER);
//	
		
		
		
		
		
		
		
		
		
		
		

	}

}
