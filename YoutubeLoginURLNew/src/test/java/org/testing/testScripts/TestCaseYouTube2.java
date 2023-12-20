package org.testing.testScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LikePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.LogoutPage;
import org.testing.Pages.SubscriptionPage;
import org.testing.Pages.VideoPlayPage;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TestCaseYouTube2 extends BaseClass {
	
	@Test
	public void Testcase1() throws InterruptedException, AWTException, IOException{
		LoginPage login= new LoginPage(driver, pr);
		login.youTubeSignIn("vv925719@gmail.com", "Gill@4321");
		ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\Gaman\\Desktop\\YouTubeScreenshots\\login.png");
		LogsCapture.takelog("Testcase1", "User is Logged in successfully");
		VideoPlayPage VideoWatch= new VideoPlayPage(driver, pr);
		VideoWatch.playVideo();
		LogsCapture.takelog("Testcase2","Video is played successfully");
		ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\Gaman\\Desktop\\YouTubeScreenshots\\PlayVideo.png");
		LikePage VideoLike= new LikePage(driver, pr);
		VideoLike.likeTheVideo();
		LogsCapture.takelog("Testcase3","Video is liked successfully");
		ScreenshotCapture.takeScreenshot(driver, "C:\\Users\\Gaman\\Desktop\\YouTubeScreenshots\\Like.png");
		SubscriptionPage ChannelSubcribe= new SubscriptionPage(driver, pr);
		ChannelSubcribe.subscriptionChannel();
		LogsCapture.takelog("Testcase4","Channel subscribed successfully");
		LogoutPage signout= new LogoutPage(driver, pr);
		signout.logoutacc();
		LogsCapture.takelog("Testcase5","User is logged out successfully");

		
	}
}
