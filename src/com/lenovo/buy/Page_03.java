package com.lenovo.buy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_03{
	public WebDriver pagedriver;
	public Page_03(WebDriver driver) {
		this.pagedriver=driver;
		PageFactory.initElements(pagedriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"guigeitem0\"]/span[2]/i")
	WebElement configuration;
	
	@FindBy(xpath="//*[@id=\"div_dingzhi\"]/div")
	WebElement sprayDrawing;
	
	@FindBy(xpath="//*[@id=\"srdz_style_scroll\"]/ul/li[1]")
	WebElement art;
	
	@FindBy(xpath="//*[@id=\"srdz_image_1538904897435\"]/div[2]/div/div[4]/dl[3]")
	WebElement image;
	
	@FindBy(xpath="//*[@id=\"srdz_dialog\"]")
	WebElement div;
	
	@FindBy(xpath="//*[@id=\"ljgm\"]")
	WebElement buy;
	
	
	

}
