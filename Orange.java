package com.examole;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expectedTitle = "Power Your Software Testing with AI and Cloud | LambdaTest";
		 driver.getTitle();
		System.out.println(driver.getTitle());
	//	Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");
		System.out.println("Title verified successfully.");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	//	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("hyd");
	//	Thread.sleep(7000);
	//	driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath(" //p[text()='Time at Work']"));
	//	Thread.sleep(7000);
	//	System.out.println("success");
		driver.findElement(By.xpath("//p[contains(@class,'My')]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[starts-with(@class,'Buzz')]"));
		System.out.println("ok");
	//	driver.get("https://www.google.com/");
		driver.quit();
	//	driver.get("https://www.google.com/");
	}

}
