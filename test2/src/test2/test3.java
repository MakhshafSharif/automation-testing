
package test2;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		driver.findElement(By.id("session_key")).sendKeys("makhshaf");
		driver.findElement(By.id("session_password")).sendKeys("098");
		driver.findElement(By.className("sign-in-form__submit-button")).click();
	    driver = new ChromeDriver();
	    //WebDriverWait wait = new WebDriverWait(Driver ,10);
		driver.findElement(By.xpath("//input[contains(@placeholder , 'Search') and contains(@class, 'search-global')]")).sendKeys("ABC");
		
		
		//driver.findElement(By.xpath("//a[contains(@class,'nav__button-secondary btn-md btn-secondary-emphasis')]")).click();
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("makhshafsharif@gmail.com");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("aerty");
	    //	driver.findElement(By.xpath("//a[contains(@id,'join_now')]")).click();
}
}

