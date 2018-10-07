package com.lenovo.buy;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
	
	public boolean isElementExsit(WebDriver driver,By by) {
		boolean flag=false;
		try {
			WebElement element=driver.findElement(by);
			flag=null!=element;
		}catch (NoSuchElementException e) {
			System.out.println( "the element was not be finded!");
		}
		return flag;
	}
	



	public void mySwitchTo(WebDriver driver,String bfHandle) {
		Set<String> lst = driver.getWindowHandles();
    	for (String iterable_element : lst) {
    		if(!iterable_element.equals(driver.getWindowHandle())) {
    			driver.switchTo().window(iterable_element);
    			break;
    		}
		}
    	String afHandle=driver.getWindowHandle();
    	driver.switchTo().window(bfHandle);
    	driver.close();
    	driver.switchTo().window(afHandle);
		
	}

}
