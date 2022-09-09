package com.test.project;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab7 {
   public WebDriver driver;
   public Log log;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://baseline01.curemd.com/curemd/datLogin.asp"); 
		log = new login(driver);
		
 } 
	@Test(priority = 1)
	public void login() {
		log.Username.sendKeys("chargeDates");
		
		log.Password.sendKeys("SuPPort.2014");
		

		log.login_btn.click();
			
		}
  @Test(priority = 2)
  public void  visitPatientPage() {
		 
	 for(String handle: driver.getWindowHandles()) {
		 
		 driver.switchTo().window(handle);
	 }
		 
		 //shift control to next window
	    
		// driver.switchTo().defaultContent();
		 
    	
		  //log = new login(driver);    
		  driver.switchTo().frame("frame1"); // switching to menu frame	
		  log.addpatient.click();
		  
		 // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3)); // click patient button
		  
		  //click patient button
		  //wait.until(ExpectedConditions.elementToBeClickable(
		  System.out.print("switch frame");
		 //logger.info("Patient button from main menu is clicked");
		  driver.switchTo().defaultContent(); // switch to parent i-frame
		  //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(log.frame1)); //switch to body i-frame
		 //logger.info("Control is shifted to body iframe");
		  
		//  wait.until(ExpectedConditions.elementToBeClickable(loginobject.addpatient)).click();  //click add patient button
		//  logger.info("Add Patient button is clicked");
		  
	 }
@Test(priority=3)
public void addpatient() {
	WebElement secondFrame = log.frame2;
	driver.switchTo().frame(secondFrame);
	
	log.add.click();
}
	@Test(priority = 4)
	public void data() {
		log.title.click();
		log.firstname.sendKeys("Makhshaf");
		log.lastname.sendKeys("Sharif");
		log.gender.click();
		log.Dob.sendKeys("10/10/2022");
		log.location.click();
		log.Save.click();
	}
	@AfterTest
	public void end() {
		driver.close(); 
	}
}
