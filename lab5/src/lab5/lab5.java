package lab5;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lab5 { 
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.in/");
		driver.findElement(By.id("ta1")).sendKeys("makhshaf");

		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();

		// textfield2
		WebElement textfield2 = driver.findElement(By.xpath("//div[@id ='HTML11']//child::div//child::textarea"));
		textfield2.getText();
		textfield2.clear();
		textfield2.sendKeys("I am trainee");

		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
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

		WebElement username = driver.findElement(By.xpath("//form[@name ='form1']//input"));
		username.sendKeys("Makhshaf");

		WebElement password = driver.findElement(By.xpath("//form[@name ='form1']//input[2]"));
		password.sendKeys("Makhshaf098");

		WebElement login = driver.findElement(By.xpath("//form[@name = 'form1']//button"));

		Actions builder = new Actions(driver);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(login));
		builder.moveToElement(login);
		builder.click();
		builder.perform();

		// Store the web element
		driver.findElement(By.cssSelector(".widget-content"));

		// Switch to the frame
		/*driver.switchTo().frame("iframe1");

		driver.switchTo().frame("iframe2");*/

		WebElement Username1 = driver.findElement(By.xpath("//form[@name ='login']//input"));
		Username1.sendKeys("Makhshaf");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement password1 = driver.findElement(By.xpath("//form[@name ='login']//input[2]"));
		password1.sendKeys("Makhshaf098");
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
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
	   /* Actions builder1 = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.elementToBeClickable(Button2));
		builder1.click();
		builder1.perform();*/
	    
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
	   WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
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
	   WebElement mroption = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
	   mroption.click();
	   //Select gender
	   WebElement check1= driver.findElement(By.xpath("//input[@value='female']"));
	   builder.click(check1).perform();
	   
	   //click on to get an alert
	   WebElement check = driver.findElement(By.xpath("//input[@value='ClickToGetAlert']"));
	   builder.click(check).build().perform();
	   alert.accept();
	   
	   //to uncheck the orange
	   WebElement check2 = driver.findElement(By.xpath("//input[@value='orange']"));
	   builder.click(check2).build().perform();
	   
	   
	   //to check blue
	   WebElement check3= driver.findElement(By.xpath("//input[@value='blue']"));
	   if(!check.isSelected()){
           check3.click();
	   }
	   //builder.build().perform();
	   
	   //to print the text of ReadThisText
	   WebElement read0 = driver.findElement(By.xpath("//input[@id='rotb']"));
	   String read = read0.getAttribute("value");
	   System.out.println(read);
	   
	   //to get prompt alert
	   WebElement check4 = driver.findElement(By.xpath("//input[@value='GetPrompt']"));
	   builder.click(check4).build().perform();
	   
	   //send input to prompt alert
	   driver.switchTo().alert().sendKeys("Makhshaf");
	   alert.accept();
	   
	   //click get confirmation to handle alert
	   WebElement check5 = driver.findElement(By.xpath("//input[@value='GetConfirmation']"));
	   builder.click(check5).build().perform();
	   alert.accept();
	   
	   //enter input in locate using class
	   driver.findElement(By.xpath("//input[@class='classone']")).sendKeys("one");
	   
	   //enter input i element having same class name of above field
	   driver.findElement(By.xpath("//h2[text()='element having same class name of above field']//following::input[@class='classone']")).sendKeys("abcde");

			   driver.findElement(By.xpath("//input[@value='Car']")).click();
			   System.out.println("Car Checkbox is selected"); 
			   
			   driver.findElement(By.xpath("//input[@value='Bag']")).click();
			   
			   driver.findElement(By.xpath("//input[@value='Book']")).click();
			   
			   // click on double click to open a dropdown
			   WebElement check6= driver.findElement(By.id("testdoubleclick"));
			   builder.click(check6).build().perform();
			   
			   // select dropdown action
			   driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
			  WebElement elem = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
			  builder.click(elem).perform();
			   
	   
	   }
	}


