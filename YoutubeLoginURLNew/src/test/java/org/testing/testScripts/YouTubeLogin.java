package org.testing.testScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass2;
import org.testng.annotations.Test;

public class YouTubeLogin extends BaseClass2{
	
	@Test(enabled=false)
	public void loginYouTube() throws InterruptedException{
	//click on the sign in button/link
	 SignInButton();
		
    //Login with gmail account
	 YouTubeLogin();
		
    //click on the trending link
    System.out.println("click on the trending link");
	wait(4);
	WebElement Trending = driver.findElement(By.xpath(pr.getProperty("YouTubeTrendings")));
	Trending.click();
    
	//click on the logout button
	logout();
	
	}
	
	@Test(enabled=false)
    public void clickSubscription() throws InterruptedException {
    wait(3);	
	//click on the sign button
	SignInButton();
	//login to youTube via gmail account
	YouTubeLogin();
	
	wait(2);
	Thread.sleep(2000);
    WebElement Subscription = driver.findElement(By.xpath(pr.getProperty("YouTubeSubscription")));
    Subscription.click();
    
    //click on the logout button
    logout();
	}
	
    @Test(enabled=false)
    public void LikeandPlay() throws InterruptedException {
    wait(3);	
	//click on the sign button
	SignInButton();
	//login to youTube via gmail account
	YouTubeLogin();
		
	//click on the video link to play
	System.out.println("click on the video link to play");
	Thread.sleep(2000);
    WebElement VideoPlay = driver.findElement(By.xpath(pr.getProperty("VideoTitle")));
    VideoPlay.click();
     
    Thread.sleep(2000);
    System.out.println("Click on the like button");
    WebElement Like = driver.findElement(By.xpath(pr.getProperty("LikeButton")));
    Like.click();

	//click on the logout button
    logout();
	}
	
    //
    @Test(enabled=false)
    public void SubscribeChannel() throws InterruptedException {
    	wait(3);	
    	//click on the sign button
    	SignInButton();
    	//login to youTube via gmail account
    	YouTubeLogin();
    
    	//click on the video link to play
    	System.out.println("click on the video link to play");
        wait(2);
        WebElement VideoPlay = driver.findElement(By.xpath(pr.getProperty("VideoTitle")));
        VideoPlay.click();
        
       //click on the unsubscribe channel button
       System.out.println("click on the unsubscribe channel button");
       wait(2);
       WebElement Unsubscribe = driver.findElement(By.xpath(pr.getProperty("SubscribeButton")));
       Unsubscribe.click();
       
       //click on the subscribe channel button
       System.out.println("click on the subscribe channel button");
       wait(3);
       WebElement Subscribe = driver.findElement(By.xpath(pr.getProperty("UnsubscribeButton")));
       Subscribe.click();
       
       wait(2);
       WebElement Unsubscribe1 = driver.findElement(By.xpath(pr.getProperty("UnsubscribeButton1")));      
       Unsubscribe1.click();
     
      wait(2);
      logout();
      
    }
    
    @Test(enabled=false)
    public void CommentOnVideo() throws InterruptedException, AWTException{
    wait(3);	
 	//click on the sign button
 	SignInButton();
 	//login to youTube via gmail account
 	YouTubeLogin();
    
 	//click on the video link to play
	System.out.println("click on the video link to play");
    wait(2);
    WebElement VideoPlay = driver.findElement(By.xpath(pr.getProperty("VideoTitle")));
    VideoPlay.click();
       
    //scroll the page to find the comment xpath locator
    wait(4);
   	JavascriptExecutor js = (JavascriptExecutor) driver;
   	js.executeScript("window.scrollBy(0,500)");
       
    //enter the comment on the video link
    System.out.println("enter the comment on the video link");
    wait(2);
    WebElement Comment= driver.findElement(By.xpath(pr.getProperty("ClickOnCommentButton")));
    Comment.click();
       
    //Comment 
    WebElement Comment1= driver.findElement(By.xpath(pr.getProperty("AddComment")));
    Comment1.sendKeys("Video was too good");
    wait(2);
    WebElement CommentButton= driver.findElement(By.xpath(pr.getProperty("SubmitComment")));
    CommentButton.click();
       
    wait(2);
    logout();

  }
    
    @Test
    public void YouTubeWatchLater() throws InterruptedException{
    	//Need to click on signin button
    	SignInButton();
     //Login to youTube by gmail account
    	YouTubeLogin();
    	   	 
     //click on the watch later in the menu
     Thread.sleep(2000);
   	 WebElement WatchLater = driver.findElement(By.xpath("WatchLater"));
   	 WatchLater.click();
    
     logout();    
    } 
    
    @Test(enabled=false)
    public void YouTubeLibrary() throws InterruptedException{
      //Need to click on signin button
       SignInButton();
      //Login to youTube by gmail account
    	YouTubeLogin();
   	 
     //click on the watch later in the menu
     Thread.sleep(2000);
   	 WebElement Library = driver.findElement(By.xpath(pr.getProperty("LibraryYOU")));
   	 Library.click();
    }

}
