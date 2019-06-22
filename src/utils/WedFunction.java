package utils;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WedFunction {
//create method of locators
public static WebDriver driver;

public static Logger applicationLog=Logger.getLogger("devpinoyLogger");

public void typeByid(String locators){
	
		
		driver.findElement(By.id("header-account-menu")).click();
		}
public void clickByid (String locators){
	
	
	driver.findElement(By.id("account-register")).click();
	}

public void typeByfirstname(String locators, String values){
	try{
		driver.findElement(By.name(locators)).clear();
		driver.findElement(By.name(locators)).sendKeys(values);
	}
	catch(Exception e){
		
	}
}
public void typeBylastname(String locators, String values){

		driver.findElement(By.name(locators)).clear();
		driver.findElement(By.name(locators)).sendKeys(values);
	
}
	public void typeByemail(String locators, String values){
		driver.findElement(By.cssSelector(locators)).sendKeys(values);
	}
	public void typeBypassword(String locators, String values){
		driver.findElement(By.xpath(locators)).sendKeys(values);
	}
	public void typeBysubmit(String locators){
		driver.findElement(By.id(locators)).click();
	}
	public void typeBydropdown(String locators, String values){
		driver.findElement(By.xpath(locators)).isDisplayed();
	}
}

