package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikePage {
	
	  public void wait(int i) throws InterruptedException{
		  Thread.sleep(i*1000);
	  }
	    ChromeDriver driver;
	    Properties pr;
	    public LikePage(ChromeDriver driver, Properties pr) {
			// TODO Auto-generated constructor stub
		 this.driver=driver;
		 this.pr=pr; 	
	    }
	
	public void likeTheVideo() throws InterruptedException{
		wait(2);
		WebElement VideoLike= driver.findElement(By.xpath(pr.getProperty("LikeButton")));
		System.out.println("You had liked the video");
		VideoLike.click();
		wait(2);
	    WebElement VideoUnlike= driver.findElement(By.xpath(pr.getProperty("LikeButton")));
	    System.out.println("You had unlike the video again");
	    VideoUnlike.click();
	}

}
