package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlayPage {
	
	public void wait(int i) throws InterruptedException{
		Thread.sleep(i*1000);
	}
	
	ChromeDriver driver;
	Properties pr;
	
	public VideoPlayPage(ChromeDriver driver, Properties pr) {
		// TODO Auto-generated constructor stub
	   this.driver=driver;
	   this.pr=pr;
			   
	}
	
	public void playVideo() throws InterruptedException{
		wait(5);
		WebElement VideoPlay = driver.findElement(By.xpath(pr.getProperty("VideoTitle")));
		VideoPlay.click();
	}

}
