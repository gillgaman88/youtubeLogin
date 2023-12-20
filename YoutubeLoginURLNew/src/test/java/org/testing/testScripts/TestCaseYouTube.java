package org.testing.testScripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testing.Base.BaseClass;
import org.testing.Pages.HomePage;
import org.testing.Pages.LikePage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.SubscriptionPage;
import org.testing.Pages.VideoPlayPage;
import org.testing.Pages.clickSubscription;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class TestCaseYouTube extends BaseClass {
	
	@Test
	public void Testcase1() throws InterruptedException, AWTException, IOException{
		//Login with gmail account and click on the menu options.
		LoginPage login= new LoginPage(driver, pr);
		login.youTubeSignIn("vv925719@gmail.com", "Gill@4321");
        HomePage TrendingLink= new HomePage(driver, pr);
		TrendingLink.HomePageTrending();
		clickSubscription subscription= new clickSubscription(driver, pr);
		subscription.clickonsubscription();
        
	}

}
