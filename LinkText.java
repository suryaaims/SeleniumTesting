package com.examole;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("///C:/Users/surya/OneDrive/Desktop/Surya.html");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Go Here")).click();
		Thread.sleep(5000);
		driver.get("///C:/Users/surya/OneDrive/Desktop/Surya.html");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Click")).click();
		Thread.sleep(5000);
		driver.quit();
		}

}
