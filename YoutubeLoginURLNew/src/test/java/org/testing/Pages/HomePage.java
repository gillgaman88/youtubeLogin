package org.testing.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public void wait(int i) throws InterruptedException {
		Thread.sleep(1 * 1000);
	}

	ChromeDriver driver;
	Properties pr;

	public HomePage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void HomePageTrending() throws InterruptedException, AWTException {
		// need to click on the trending link
		wait(5);
		Robot robot = new Robot();
		robot.mouseMove(215, 475);
		for (int i = 0; i < 4; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.delay(400);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		WebElement Trending = driver.findElement(By.xpath(pr.getProperty("YouTubeTrendings")));
		Trending.click();
	}
}