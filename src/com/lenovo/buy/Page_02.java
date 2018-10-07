package com.lenovo.buy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_02{
	public WebDriver pagedriver;
	public Page_02(WebDriver driver) {
		this.pagedriver=driver;
		PageFactory.initElements(pagedriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"productList\"]/li[1]/div[2]/a")
	WebElement carbon;
}
