package ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver  driver;
	public HomePage (WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By Searchbox = By.xpath("//input[@placeholder='Search for a product, category or brand']");
	By Searchbutton = By.xpath("//input[@class='newsrchbtn' and @aria-label='Search']");
	By EnterpriceEml = By.xpath("//a[@title='Enterprise Email']");
	By videos = By.xpath("//a[@title='Watch videos']");
	By BusnissEml = By.xpath("//a[@title='Lightning fast business email hosting']");
	By Money = By.xpath("//a[@title='Live commentary of the Indian stock markets, stock quotes and business news']");
	By Rediffmil = By.xpath("//a[@title='Lightning fast free email']");
	
	
	public WebElement serchbox()
	{
		return driver.findElement(Searchbox);
	}
	
	public WebElement searchboxbutton()
	{
		return driver.findElement(Searchbutton);
	}
	
	public WebElement EnterpriceEmail()
	{
		return driver.findElement(EnterpriceEml);
	}
	
	public WebElement Videosbutton()
	{
		return driver.findElement(videos);
	}
	
	public WebElement BusnissEmail()
	{
		return driver.findElement(BusnissEml);
	}
	
	public WebElement Moneybutton()
	{
		return driver.findElement(Money);
	}
	
	public WebElement RediffMail()
	{
		return driver.findElement(Rediffmil);
	}
	
	
	
	
	
	
}
