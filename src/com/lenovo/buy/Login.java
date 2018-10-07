package com.lenovo.buy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login{
	public WebDriver pagedriver;
	public Login(WebDriver driver) {
		this.pagedriver=driver;
		PageFactory.initElements(pagedriver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"normal_login_box\"]/div[1]")
	WebElement accountdiv;
	
	@FindBy(xpath="//*[@id=\"normal_login_box\"]/div[1]/input")
	WebElement accountinput;
	
	@FindBy(xpath="//*[@id=\"normal_login_box\"]/div[2]")
	WebElement pwddiv;
	
	@FindBy(xpath="//*[@id=\"pwd\"]")
	WebElement pwdinput;

	@FindBy(xpath="//*[@id=\"ppWrapper\"]/div[1]/a")
	WebElement login;
}
