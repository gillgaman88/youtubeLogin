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

public class BaseClass {

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

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2500);
		System.out.println("Close the browser");
		//driver.close();
	}
}