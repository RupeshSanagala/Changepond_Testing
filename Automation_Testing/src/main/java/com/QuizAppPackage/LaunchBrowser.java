package com.QuizAppPackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
     
	
	public static void main(String[] args) {
		WebDriver driver1 = new ChromeDriver();
		
//		driver1.get("http://quiz-fe-test.hematitecorp.com/");
		
//		WebDriver driver1 = new FirefoxDriver();
//		
//		driver1.get("http://quiz-fe-test.hematitecorp.com/");

	    System.out.println(driver1.getTitle());
		
		System.out.println(driver1.getCurrentUrl());
		
		System.out.println(driver1.getPageSource());
		
		driver1.close();
		
        driver1.navigate().to("http://hematiteweb.hematitecorp.com/");
		
		driver1.navigate().back();
		
		driver1.navigate().forward();
		
		driver1.navigate().refresh();
		
		driver1.manage().window().maximize();
		
		driver1.manage().window().minimize();
		
		driver1.manage().window().setSize(new Dimension(1024,768)); 
		//import from selenium
		
//		driver1.switchTo().alert();
		
//		driver1.manage().getCookies();

	}

}
