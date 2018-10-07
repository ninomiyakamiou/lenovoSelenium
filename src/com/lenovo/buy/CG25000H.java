package com.lenovo.buy;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;


public class CG25000H{
	String url;
	String account;
	String password;
	String bfHandle;
	public WebDriver driver;
	public CG25000H(){}
    public CG25000H(String url,String account,String password) {
    	this.account=account;
    	this.password=password;
    	this.url=url;
    }
    
    @BeforeClass
   // @Parameter("DriverLocation")
    public void setup() {
    	System.setProperty("webdriver.chrome.driver",MyParameter.driverPath);
    	driver = new ChromeDriver();
    }
    
    @Test
    public void test() throws InterruptedException {
    	By by_01=By.partialLinkText("X1 系列（黑色智慧）");
    	Page_01 pg01=new Page_01(driver);
    	Page_02 pg02=new Page_02(driver);
    	Page_03 pg03=new Page_03(driver);
    	Login login=new Login(driver);
    	CommonFunctions common=new CommonFunctions();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get(url);
    	JavascriptExecutor jsExe;
    	Actions act=new Actions(driver);
    	
    	act.moveToElement(pg01.thinkPad).perform();
    	Thread.sleep(3000);
    	if(common.isElementExsit(driver, by_01)) {
    		WebElement black=new WebDriverWait(driver,5)
    			.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("X1 系列（黑色智慧）")));
    		black.click();
    	}
    	
    	Thread.sleep(5000);
    	bfHandle=driver.getWindowHandle();
    	common.mySwitchTo(driver, bfHandle);
    	
    	pg02.carbon.click();
    	
    	Thread.sleep(5000);

    	bfHandle=driver.getWindowHandle();
    	common.mySwitchTo(driver, bfHandle);
    	
    	pg03.configuration.click();
    	Thread.sleep(5000);
    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container_info\"]/ul/li[4]"))).build().perform();
    	pg03.sprayDrawing.click();
    	//JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("document.getElementsByClassName()[0].className='dz-img checked'");
    	driver.findElements(By.className("dz-img")).get(0).click();
    	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"dz_OK\"]"))).click().perform();
    	
    	act.click(pg03.buy).perform();
    	Thread.sleep(2000);
    	login.accountdiv.click();
    	login.accountinput.sendKeys(account);
    	login.pwddiv.click();
    	login.pwdinput.sendKeys(password);
    	driver.findElement(By.xpath("//*[@id=\"ppWrapper\"]/div[1]/a")).click();
    	
    	Thread.sleep(5000);
    	
    	
    
    	
    	
    	
    	

    }
    
    @AfterClass
    public void breakDowm() {
    	driver.quit();
    }
    
    
}
