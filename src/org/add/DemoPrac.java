package org.add;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoPrac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Justin Royan\\eclipse-workspace\\SeleniumDay2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		WebElement clkSign = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div"));
		clkSign.click();
		
		WebElement clkNew = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[1]"));
		clkNew.click();
		
		WebElement clkNo = driver.findElement(By.xpath("//*[@id=\\\"userName\\\"]"));
		clkNo.click();
		
		WebElement txtNo = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		txtNo.sendKeys("7339028004");
		
		WebElement clkCont = driver.findElement(By.id("checkUser"));
		clkCont.click();

	}
}
