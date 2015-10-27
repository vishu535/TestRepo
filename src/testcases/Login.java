
package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pomClasses.Home_Page;
import pomClasses.PageBase;

public class Login extends PageBase {
		WebDriver driver = new FirefoxDriver();
		@BeforeTest
		public void openUrl(){
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/");
		
		}
		@Test
		public void underTest() throws InterruptedException{
			
			Home_Page hp = new Home_Page(driver);
			hp.login_user();
			System.out.print("Registered Successfully");
		}
		@AfterTest
		public void QuitDriver(){
			driver.quit();
			  }
			
	}
	


