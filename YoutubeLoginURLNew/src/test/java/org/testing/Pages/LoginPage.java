package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	ChromeDriver driver;
	Properties pr;
	
	public void wait(int i) throws InterruptedException {
	Thread.sleep(i * 1000);
	}

	public LoginPage(ChromeDriver driver, Properties pr) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.pr = pr;
	}

	public void youTubeSignIn(String Email, String Password) throws InterruptedException {
		// Login the account
		WebElement SignIn = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginSignInButton")));
		SignIn.click();
		//Need to enter the email address
   		wait(2);
   		WebElement UserEmail = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginEmail")));
		UserEmail.sendKeys(Email);
		WebElement NextButton = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginEmailNext")));
		NextButton.click();
		
		//Need to enter the password
   		wait(5);
		WebElement UserPassword = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginPassword")));
		UserPassword.sendKeys(Password);
   		wait(3);
		WebElement NextButton2 = driver.findElement(By.xpath(pr.getProperty("YouTubeLoginPasswordNextButton")));
		NextButton2.click();

	}

}
