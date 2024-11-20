package com.examole;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args)
	{
	//	System.setProperty("webdriver.chromedriver", "./Resources/chromedriver.exe");
		WebDriver driver= new EdgeDriver();
	//	driver.get("https://x.com/");
		driver.navigate().to("http://www.google.com/");
		driver.get("https://www.youtube.com/");
		driver.get("https://www.google.com/maps");
		driver.close();
	}

}
