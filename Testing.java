package com.examole;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {
	//	WebDriverManager.chromedriver.setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	//	driver.findElement(By.id("header_block"));
	//	driver.findElement(By.className("_97w4")).click();
		driver.findElement(By.id("email")).sendKeys("surya");
		driver.findElement(By.name("pass")).sendKeys("hyderbad");
		driver.findElement(By.id("loginbutton")).click();
	}

}
