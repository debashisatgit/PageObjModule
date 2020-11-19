package ObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {            //created a constructor with the class name    (S-1 for accessing the test class)                    
	  
		this.driver=driver;                         //S-2
	}
	By username = By.xpath("//input[@id='login1']");
    By Password = By.xpath("//input[@id='password']");
    By Signin = By.xpath("//input[@name='proceed']");
    By HomeButton = By.xpath("//a[text()='rediff.com']");
    By ForgotPw = By.xpath("//*[text()='Forgot Password?']");
    By CreateNewAcc = By.xpath("//*[text()='Create a new account']");
    By KeepMeSiginCheckBox = By.xpath("//input[@id='remember']");
    
  
    
    public WebElement Emaild()
    {
    	return driver.findElement(username);           //change the returen type to webelement from void  s-4
    }
    
    public WebElement Password()
    {
    	return driver.findElement(Password);           //change the returen type to webelement from void  s-6
    }
    
    
    public WebElement SigninButton()
    {
    	return driver.findElement(Signin);           //change the returen type to webelement from void  s-8
    }
    
    public WebElement homeButton()
    {
    	return driver.findElement(HomeButton);           //change the returen type to webelement from void  s-8
    }
    
    public WebElement ForgotPAssword()
    {
    	return driver.findElement(ForgotPw);           
    }
    
    public WebElement CreateNewAccount()
    {
    	return driver.findElement(CreateNewAcc);           
    }
    
    public WebElement KeepMeSiginCheckbox()
    {
    	return driver.findElement(KeepMeSiginCheckBox);           
    }
    
    
    
}
