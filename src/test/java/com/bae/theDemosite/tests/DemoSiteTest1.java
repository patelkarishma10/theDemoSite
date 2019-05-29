package com.bae.theDemosite.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest1 {
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardonw() {
		driver.quit();
	}

	@Test
	public void methodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");
		WebElement checkElement = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		checkElement.click();
		WebElement checkElement2 = driver.findElement(By.name("username"));
		checkElement2.sendKeys("hello");
		WebElement checkElement3 = driver.findElement(By.name("password"));
		checkElement3.sendKeys("aPassword");
		checkElement3.submit();
		WebElement checkElement4 = driver.findElement(
				By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		checkElement4.click();
		WebElement checkElement5 = driver.findElement(By.name("username"));
		checkElement5.sendKeys("hello");
		WebElement checkElement6 = driver.findElement(By.name("password"));
		checkElement6.sendKeys("aPassword");
		checkElement6.submit();
		WebElement checkElement7 = driver
				.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		assertTrue(checkElement7.isDisplayed());
		Thread.sleep(10000);
	}
}
