package com.examole;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testsample {

	public static void main(String[] args) {
	  
		        
		    // declaration and instantiation of objects/variables  
	//	    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("https://www.google.com/maps");  
		          
		    // Click on the search text box and send value  
		   // WebElement ele= driver.findElement(By.xpath("\\input[@name='username']"));
		 //   ele.sendKeys("Admin");
		  //  driver.findElement(By.name("password")).sendKeys("admin123");
		  //  driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button").click());
		    System.out.println(driver.getCurrentUrl());
		    System.out.println(driver.getTitle());
		 //   System.out.println(driver.getPageSource());
		    driver.quit();

	}

}
