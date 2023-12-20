package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass2 {

	public ChromeDriver driver;
	public Properties pr;

	@BeforeMethod
	public void beforeMethod() throws IOException {

		File f = new File("../YoutubeLoginURLNew/ObjectRepo.Properties");
		FileInputStream fs = new FileInputStream(f);
		pr = new Properties();
		pr.load(fs);

		// driver=new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		// options.addArguments("start-maximized");
		// options.addArguments("--incognito");
		// DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// options.merge(capabilities);
		// ChromeDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		// driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	}
	
	public void SignInButton() throws InterruptedException {
		System.out.println("Click on the sign-in button");
		wait(1);
		WebElement Element = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginSignInButton")));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", Element);
	}

	public void YouTubeLogin() throws InterruptedException {

		// enter the email address
		System.out.println("enter the email address");
		wait(1);
		WebElement Email = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginEmail")));
		Email.sendKeys("vv925719@gmail.com");
		WebElement Next = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginEmailNext")));
		Next.click();

		// enter the password
		System.out.println("enter the password");
		wait(6);
		WebElement Password = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginPassword")));
		Password.sendKeys("Gill@4321");
		wait(3);
		WebElement NextButton = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginPasswordNextButton")));
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("arguments[0].click();", NextButton);
	}

	public void logout() throws InterruptedException {
		// click on the profile icon
		System.out.println("click on the profile icon");
		wait(2);
		WebElement ProfileIcon = driver.findElement(By.xpath(pr.getProperty("YouTubeProfileIcon")));
		ProfileIcon.click();
		System.out.println("Logout the profile");
		wait(2);
		WebElement Logout = driver.findElement(By.xpath(pr.getProperty("YouTubeLogout")));
		Logout.click();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2500);
		System.out.println("Close the browser");
		driver.close();
	}
}