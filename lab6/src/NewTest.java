
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest { 
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions at;
	public Alert alert;
	@BeforeTest
	public void launchWebDriver()  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.in/");
	}
	@Test (priority=1)
	public void PrintAndFetchData() {
		driver.findElement(By.id("ta1")).sendKeys("makhshaf");

		at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();

		// textfield2
		WebElement textfield2 = driver.findElement(By.xpath("//div[@id ='HTML11']//child::div//child::textarea"));
		textfield2.getText();
		textfield2.clear();
		textfield2.sendKeys("I am trainee");

		at.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	
	@Test (priority=2)
	public void table() {
		//Table
		String tr1td1 = driver.findElement(By.xpath("//table/tbody/tr[1]/td")).getText();
		System.out.print(tr1td1);
		System.out.print(" ");

		String tr1td2 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
		System.out.print(tr1td2);
		System.out.print(" ");

		String tr1td3 = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
		System.out.print(tr1td3);
		System.out.print(" ");

		String tr2td1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td")).getText();
		System.out.print(tr2td1);
		System.out.print(" ");

		String tr2td2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.print(tr2td2);
		System.out.print(" ");

		String tr2td3 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
		System.out.print(tr2td3);
		System.out.print(" ");

		String tr3td1 = driver.findElement(By.xpath("//table/tbody/tr[3]/td")).getText();
		System.out.print(tr3td1);
		System.out.print(" ");

		String tr3td2 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.print(tr3td2);
		System.out.print(" ");

		String tr3td3 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]")).getText();
		System.out.print(tr3td3);
		System.out.print(" ");

		String tr4td1 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.print(tr4td1);
		System.out.print(" ");

		String tr4td2 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.print(tr4td2);
		System.out.print(" ");

		String tr4td3 = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]")).getText();
		System.out.print(tr4td3);
		System.out.print(" ");
	}
	@Test (priority=3)
	public void htmlForm() {
       
		WebElement username = driver.findElement(By.xpath("//form[@name ='form1']//input"));
		username.sendKeys("Makhshaf");

		WebElement password = driver.findElement(By.xpath("//form[@name ='form1']//input[2]"));
		password.sendKeys("Makhshaf098");

		WebElement login = driver.findElement(By.xpath("//form[@name = 'form1']//button"));

		Actions builder = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		builder.moveToElement(login);
		builder.click();
		builder.perform();

		// Store the web element
		driver.findElement(By.cssSelector(".widget-content"));
	}
	@Test (priority=4)
	public void frame() {
		// Switch to the frame
		/*driver.switchTo().frame("iframe1");

		driver.switchTo().frame("iframe2");*/

		WebElement Username1 = driver.findElement(By.xpath("//form[@name ='login']//input"));
		Username1.sendKeys("Makhshaf");
		Assert.assertEquals(true, Username1.isEnabled()); //Verifies that the textbox 

		WebElement password1 = driver.findElement(By.xpath("//form[@name ='login']//input[2]"));
		password1.sendKeys("Makhshaf098");

		WebElement Login = driver.findElement(By.xpath("//form[@name ='login']//input[3]"));
		Login.click();

		// Switching to Alert        
       Alert alert = driver.switchTo().alert();		
       
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        		
        // Accepting alert		
        alert.accept();	
	}
	@Test (priority=5)
	public void dropDown() {
        //Dropdown
        Select multiselect1 = new Select(driver.findElement(By.id("multiselect1")));
		multiselect1.selectByVisibleText("Hyundai");
		multiselect1.selectByIndex(2);
		driver.findElement(By.xpath("//option[@id ='ironman4']")).click();
		
		//Hello world text
		driver.findElement(By.xpath("//input[@id='textbox1']")).clear();
	    driver.findElement(By.xpath("//input[@id='textbox1']")).sendKeys("Hello World");
		
	    //Enabled Button(Selenium Tutorial)
	    driver.findElement(By.id("but2")).click();
	    
	    //Button with same attribute
	    driver.findElement(By.xpath("//button[@name='samename'][1]")).click();
	    driver.findElement(By.xpath("//button[@name='samename'][2]")).click();
	    driver.findElement(By.xpath("//button[@name='samename'][3]")).click();
	    
	    //Clickaftertextdisappear
	    driver.findElement(By.id("alert2")).click();
	    driver.switchTo().alert().accept();
	    
	    //open popup window
	   driver.findElement(By.xpath("//a[contains(@href,'JavaScript:newPopup')]")).click();
	   String parent = driver.getWindowHandle();
	// To handle all new opened window.	
	   Set<String>s = driver.getWindowHandles();
	   //Now iterate using iterator
	   Iterator<String>window = s.iterator();
	   while(window.hasNext()) {
		   String child_window = window.next();
		   if(!parent.equals(child_window)) {
			   driver.switchTo().window(child_window);
			 
			   driver.close();
		   }
		   
	   }
	   //switch to parent window
	   driver.switchTo().window(parent); 
	   
	   //Hit try it button
	   WebElement tryButton = driver.findElement(By.xpath("//button[text()='Try it']"));
	   tryButton.click();
	   //at.sendKeys(Keys.PAGE_DOWN).build().perform();
	   
	   //Hit double click button
	   WebElement db1Click = driver.findElement(By.xpath("//button[text()= ' Double click Here   ']"));
	  
	   Actions act = new Actions(driver);
	   act.doubleClick(db1Click).perform();
	   driver.switchTo().alert().accept();
	   
	   //click try it to enable the check box 
	   WebElement Click = driver.findElement(By.xpath("//button[text()='Check this']"));
	   Click.click();
	}
	@Test (priority=6)
	public void gender() {
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(11));
	  WebElement mroption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
	  mroption.click();

	   //Select gender
	
	   WebElement check1=wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//input[@value='female']"))));
	   at.click(check1).perform();
	   
	   //to uncheck the orange
	   WebElement check2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='orange']"))));
	   at.click(check2).build().perform();
	   
	   
	   //to check blue
	   WebElement check3= wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='blue']"))));
	   if(!check3.isSelected()){
           check3.click();
	   }
	   //builder.build().perform();
	   
	   //to print the text of ReadThisText
	   WebElement read0 = driver.findElement(By.xpath("//input[@id='rotb']"));
	   String read = read0.getAttribute("value");
	   System.out.println(read);
	   
	  
	   
	   // Click on Get prompt button
       driver.findElement(By.xpath("//input[@id = 'prompt']")).click();
       WebDriverWait wait8 = new WebDriverWait (driver,Duration.ofSeconds(4));
		Alert alert5 = wait8.until(ExpectedConditions.alertIsPresent());
		alert5.sendKeys("Makhshaf");
		alert5.accept();
       
       
	
       //// Click on Get confirmation button
       driver.findElement(By.xpath("//input[@id = 'confirm']")).click();
        
        WebDriverWait wait7 = new WebDriverWait (driver,Duration.ofSeconds(4));
		Alert alert4 = wait7.until(ExpectedConditions.alertIsPresent());
		alert4.accept();
       
      
        //Fill Form and Select car and bag
		List <WebElement> field1 =  driver.findElements(By.xpath("//input[contains(@class ,'classone')]"));
        field1.get(0).sendKeys("Makhshaf");
        field1.get(1).sendKeys("Cure MD");
      
     
        // radio button to select car

        
        WebElement car = driver.findElement(By.xpath("//input[@value = 'Car']"));
        WebElement Bicycle = driver.findElement(By.xpath("//input[ @value = 'Bicycle']"));
        if(Bicycle.isSelected()) {
        	
        	car.click();
        	
        }
        
        else {
        	car.click();
        	}
        
        
        
        // Check button to de-select Laptop and and select Bag
        
        WebElement Book = driver.findElement(By.xpath("//input[@value = 'Book']"));
        WebElement Bag = driver.findElement(By.xpath("//input[@value = 'Bag']"));
        if(Book.isSelected()) {
        	
        	Bag.click();
        	Book.click();
        	
        }
        
        else {
        	Book.click();
        	}
        
        
        // Drop Down Button 
        WebElement dropdown = driver.findElement(By.xpath("//button[text() = 'Dropdown']"));
        Actions action11 = new Actions(driver);
		Action op11 = action11.click(dropdown).build();
		op11.perform();	
		
		
		WebElement facebook = driver.findElement(By.xpath("//a[text() = 'Facebook']"));
		WebDriverWait fb = new WebDriverWait (driver, Duration.ofSeconds(3));
		fb.until(ExpectedConditions.visibilityOf(facebook));
        Actions action12 = new Actions(driver);
		Action op12 = action12.moveToElement(facebook).click().build();
		op12.perform();
		
	}
	@AfterTest
	public void quitWindow()  {
		driver.close();
		
	}
	   
	   }


