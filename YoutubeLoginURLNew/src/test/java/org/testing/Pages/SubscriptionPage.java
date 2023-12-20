package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscriptionPage {
	
	public void wait(int i) throws InterruptedException{
		Thread.sleep(i*1000);
	}
	
	ChromeDriver driver;
	Properties pr;
	public SubscriptionPage(ChromeDriver driver, Properties pr) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		this.pr=pr;
	}
	
	public void subscriptionChannel() throws InterruptedException{
	wait(3);
	WebElement channelSubscribe = driver.findElement(By.xpath(pr.getProperty("SubscribeButton")));
	channelSubscribe.click();
	System.out.println("subscribe");
	WebElement channelUnsubscribe = driver.findElement(By.xpath(pr.getProperty("UnsubscribeButton")));
	channelUnsubscribe.click();	
	System.out.println("Unsubscribe pop up open");

	//Pop-up click on the pop-up button
	wait(1);
	WebElement channelUnsubscribe1 = driver.findElement(By.xpath(pr.getProperty("UnsubscribeButton1")));
	channelUnsubscribe1.click();
	wait(1);
	WebElement channelUnsubscribe2 = driver.findElement(By.xpath(pr.getProperty("UnsubscribeButton2")));
	channelUnsubscribe2.click();
	
	System.out.println("Unsubscribe");

	
	}
	
	

}
