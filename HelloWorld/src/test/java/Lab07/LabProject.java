package Lab07;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LabProject {
	WebDriver driver;
	   public login log;
	   
		@BeforeTest
		public void setup() {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
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
		 WebElement firstFrame = log.frame1;
			driver.switchTo().frame(firstFrame);
			  log.addpatient.click();
		
			  driver.switchTo().defaultContent(); 
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
			log.Dob.sendKeys("10/06/2021");
			log.location.click();
			log.Save.click();
			 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3)); 
			 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(log.thirdFrame));
			log.saveasnew.click();
		}
		
		//@AfterTest
		//public void end() {
		//	driver.close(); 
		}
	//}
