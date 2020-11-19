package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjRepo.DashbordPage;
import ObjRepo.HomePage;
import ObjRepo.LoginPage;

public class LoginApp {
	
	@Test
	public void Login() throws InterruptedException, IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\THI1901459\\\\cromeDriverEx\\\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();        // C:\\Users\\THI1901459\\cromeDriverEx\\chromedriver.exe
		driver.manage().window().maximize();
		
//      fatch data from property "file using fileInpitStream"		
//		Properties prop = new Properties();
//		FileInputStream fis = new FileInputStream("C:\\Users\\THI1901459\\eclipse-workspace\\PageObjModule\\src\\TestCases\\data.properties1");
//		prop.load(fis);                                    //load method will load that file in reading mode
//		System.out.println(prop.getProperty("browser"));  //with getproperty method u can call the value frm property file= browser
//		System.out.println(prop.getProperty("url"));     //with getproperty method u can call the value frm property file= url
//		//to read the data from file we use FileInputStream
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);	
		
		
		LoginPage rd = new LoginPage(driver);                   //s-3 create the obj of the login page of obj repo to call  the values
		
		rd.Emaild().sendKeys("pomtest");                                            //s-5
		rd.Password().sendKeys("Synergy@123");                                      //s-7
		//rd.SigninButton().click();                                                  //s-9
		rd.homeButton().click();
		
		
		HomePage jd = new HomePage(driver);                   //create the obj of the Home page of obj repo to call  the values
		
		jd.serchbox().sendKeys("books");
		//jd.searchboxbutton().click();
		
	
		
		DashbordPage dj = new DashbordPage(driver);          //create the obj of the Dashbord page of obj repo to call  the values
		
		//dj.WriteaMail().click();
		//dj.LestSideContain().click();
		//dj.CalenderB().click();
		//dj.NewMailButton().click();
		//dj.DeleteButton().click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
