package org.testing.Utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownHandling {
	
	ChromeDriver driver;
	Properties pr;
	public DropDownHandling(ChromeDriver driver, Properties pr) {
		// TODO Auto-generated constructor stub
	}

	public void dropDownUsingIndex(int index) {
		Select element= new Select(driver.findElement(By.xpath(pr.getProperty(""))));
		element.selectByIndex(index);
	}
	
	public void dropDownUsingValue(String value, ChromeDriver driver){
	   Select element1=new Select(driver.findElement(By.xpath(pr.getProperty(""))));
	   element1.selectByValue(value);
	}
		
	public void dropDownUsingVisibleText(String text, ChromeDriver driver){
		 Select element2=new Select(driver.findElement(By.xpath(pr.getProperty(""))));
		   element2.selectByVisibleText(text);;	
	}
	
}
