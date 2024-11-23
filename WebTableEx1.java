package com.examole;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebTableEx1 {
	

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		driver=new FirefoxDriver();
		
		
		driver.get("file:///C:/Users/surya/OneDrive/Desktop/Table1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	

		//Finding number of Rows
		List<WebElement> headingRowsNumber = driver.findElements(By.xpath("//table/thead/tr"));
		int headingRows = headingRowsNumber.size();
		List<WebElement> rowsNumber = driver.findElements(By.xpath("//table/tbody/tr"));
		int rowCount = rowsNumber.size();
		System.out.println("No of rows in this table : " + (headingRows + rowCount));

		//Finding number of Columns
		
		List<WebElement> columnsNumber = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		//Finding cell value at 4th row and 3rd column

		WebElement cellAddress = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " +value);

		//driver.quit();
}
}