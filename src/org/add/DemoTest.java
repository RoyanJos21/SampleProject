package org.add;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Justin Royan\\eclipse-workspace\\SeleniumDay2\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement txtFirstNmae = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		txtFirstNmae.sendKeys("Royan");

		WebElement txtLastName = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		txtLastName.sendKeys("Joseph");

		WebElement txtaddress = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		txtaddress.sendKeys("Chennai. OMR");

		WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		txtEmail.sendKeys("royanjos279@gmail.com");

		WebElement txtPhone = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		txtPhone.sendKeys("7339028004");

		WebElement cliMale = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		cliMale.click();

		WebElement cliCri = driver.findElement(By.id("checkbox1"));
		cliCri.click();

		WebElement cliSkills = driver.findElement(By.id("Skills"));
		Select s = new Select(cliSkills);
		s.selectByVisibleText("C");

		WebElement cliLan = driver.findElement(By.id("msdd"));
		cliLan.click();
				
		
	}
}