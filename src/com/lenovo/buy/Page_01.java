package com.lenovo.buy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_01{
	public WebDriver pagedriver;
	public Page_01(WebDriver driver) {
		this.pagedriver=driver;
		PageFactory.initElements(pagedriver, this);
	}
	
	@FindBy(xpath="/html/body/div[9]/div/div[1]/div[1]/div[3]/div/div/ul/li[2]/div/a")
	WebElement thinkPad;
	
	@FindBy(partialLinkText="X1 系列（黑色智慧）")
	WebElement select;
	

}
