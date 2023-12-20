package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickSubscription {

	public void wait (int i) throws InterruptedException{
		Thread.sleep(i*1000);
	}
	
	
	ChromeDriver driver;
	Properties pr;

	public clickSubscription(ChromeDriver driver, Properties pr) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pr = pr;
	}

	public void clickonsubscription() throws InterruptedException {
        wait(3);
		WebElement SubscriptionButton = driver.findElement(By.xpath(pr.getProperty("YouTubeSubscription")));
		SubscriptionButton.click();
	}

}
