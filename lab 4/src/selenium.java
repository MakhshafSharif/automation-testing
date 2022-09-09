import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class selenium {
	/*public static void waitMethod(long x) {
		try {
			Thread.sleep(x);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//LOGIN THE PAGE
		driver.get("https://www.way2automation.com/");
		//HITTING ELEMENTS
		WebElement button=driver.findElement(By.linkText("All Courses"));
		Actions builder = new Actions(driver);
		waitMethod(1000);
		//click Selenium
		builder.moveToElement(button).click().build().perform();
		WebElement sele = driver.findElement(By.linkText("Selenium"));
		Actions open = new Actions(driver);
		open.moveToElement(sele).click().build().perform();
		waitMethod(1000);
		
		//Selenium with java
		WebElement but = driver.findElement(By.linkText("Selenium with Java"));
		Actions again = new Actions(driver);
		open.moveToElement(but).click().build().perform();
		waitMethod(1000);
		
		driver.close();

	}
} */
	
	
	public static void waitMethod(long x) {
		try {
			Thread.sleep(x);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	} 
   public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver" , "C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php");
	
	//Switch to main frame by window handling object
	String windowHandle = driver.getWindowHandle();
	driver.switchTo().frame(0);
	
	//find element from main frame
	driver.findElement(By.linkText("New Browser Tab")).click();
	try {
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println(e);
	}

   //Handle Window for accessing new frame
   
   driver.switchTo().window(windowHandle);
   try {
		Thread.sleep(2000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
   driver.findElement(By.xpath("//a [@href='#example-1-tab-2']")).click();
   
   //Switch to frame 1 for accessing element under frame
   driver.switchTo().frame(1);
   driver.findElement(By.linkText("Open New Seprate Window")).click();
  try {
		Thread.sleep(2000);
	}
	catch(Exception a) {
		System.out.println(a);
	}
	
   //Back to main frame
   driver.switchTo().window(windowHandle);
   
   driver.findElement(By.xpath("//a [@href='#example-1-tab-3']")).click();
	
   //Switch to frame 2 for accessing element under frame
   driver.switchTo().frame(2);
   driver.findElement(By.linkText("Open Frameset Window")).click();
   try {
		Thread.sleep(2000);
	}
	catch(Exception a) {
		System.out.println(a);
	}
    //Switch to main frame
     driver.switchTo().window(windowHandle);
     driver.findElement(By.xpath("//a [@href='#example-1-tab-4']")).click();
     //Switch to frame 3 for accessing element under frame
     driver.switchTo().frame(3);
     driver.findElement(By.linkText("Open multiple pages")).click();
   try {
		Thread.sleep(2000);
	}
	catch(Exception a) {
		System.out.println(a);
	}
   driver.switchTo().window(windowHandle);
   }

} 
	
	
	
	/*public static void waitMethod(long x) {
		try {
			Thread.sleep(x);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , "C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sso.teachable.com/secure/673/identity/login");
		driver.findElement(By.xpath("//a [@href='/secure/673/identity/sign_up']")).click();
		
		waitMethod(1000);
		
		driver.findElement(By.id("user_name")).sendKeys("makhshaf");
		
		waitMethod(1000);
		driver.findElement(By.id("user_email")).sendKeys("makhshaf@gmail.com");
		
		waitMethod(1000);
		
		driver.findElement(By.id("password")).sendKeys("09okj");
		waitMethod(1000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']"));
		waitMethod(1000);
		
	    driver.findElement(By.xpath("//input[@value='1']")).click();
		waitMethod(1000);
		driver.close();
		
		
  }
}*/


	
