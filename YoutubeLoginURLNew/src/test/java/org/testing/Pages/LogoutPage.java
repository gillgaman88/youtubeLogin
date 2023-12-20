package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {
	
	ChromeDriver driver;
	Properties pr;
	
	public LogoutPage(ChromeDriver driver, Properties pr) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void logoutacc() throws InterruptedException{
	    Thread.sleep(2000);
		WebElement profileicon= driver.findElement(By.xpath(pr.getProperty("YouTubeProfileIcon")));
		profileicon.click();
	    Thread.sleep(2000);
	    
	    WebElement Logout=driver.findElement(By.xpath(pr.getProperty("YouTubeLogout")));
	    Logout.click();
	
	}

}
