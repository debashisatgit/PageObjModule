package ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashbordPage {
	
	
	WebDriver  driver;
	public DashbordPage (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	By WriteEmail = By.xpath("//ul[@id='boxscroll']/li/a/b[contains(text(),'Write mail')]");
	By LeftSidegenericContain = By.xpath("//ul[@id='boxscroll']/li/a[contains(text(),'Inbox')]");
	By NewMAil = By.xpath("//a[contains(text(),'New Mail')]");
	By DeleteButton = By.xpath("//span[@class='rd_fil_del']");
	By Calender = By.xpath("//h4[@title='Calendar']");
	
	
	
	
	public WebElement WriteaMail()
	{
		return driver.findElement(WriteEmail);
	}
	
	public WebElement LestSideContain()
	{
		return driver.findElement(LeftSidegenericContain);
	}
    
	public WebElement NewMailButton()
	{
		return driver.findElement(NewMAil);
	}
	
	public WebElement DeleteButton()
	{
		return driver.findElement(DeleteButton);
	}
	
	public WebElement CalenderB()
	{
		return driver.findElement(Calender);
	}
	
	
	
	
}
