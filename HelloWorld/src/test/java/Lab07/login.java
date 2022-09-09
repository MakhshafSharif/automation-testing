package Lab07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import utils.ExcelUtils;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver;
	}
		
		@FindBy(xpath="//input[@id='vchLogin_Name']")
		public WebElement Username;
		
		@FindBy(xpath="//input[@id='vchPassword']")
		public WebElement Password;

		@FindBy(xpath="//button[@class='btn btn-danger']")
		public WebElement login_btn;
		
		@FindBy(xpath="//iframe[@id='fraCureMD_Menu']")
		public WebElement frame1;
		
		@FindBy(xpath="//img[@id='patientBtn']")
		public WebElement addpatient;
		
		@FindBy(xpath="//iframe[@id='fraCureMD_Body']")
		public WebElement frame2;
		
		@FindBy(xpath="//td[@title='Add Patient']")
		public WebElement add;
		
		@FindBy(xpath="//select[@id='cmbVTitle']//option[@value='16']")
		public WebElement title;
		
		@FindBy(xpath="//input[@name='txtVFNAME']")
		public WebElement firstname;
		
		@FindBy(xpath="//input[@name='txtVLNAME']")
		public WebElement lastname;
		
		@FindBy(xpath="//select[@name='cmbVSEX']//option[@value='F']")
		public WebElement gender;
		
		@FindBy(xpath="//input[@id='txtDDOB']")
		public WebElement Dob;
		
		@FindBy(xpath="//select[@id='cmbILOCID']//option[@value='19']")
		public WebElement location;
		
		@FindBy(xpath="//td[@id='tdsave']")
		public WebElement Save;
		
		@FindBy(xpath="//iframe[@id='DynamicBHdialogbox']")
		public WebElement thirdFrame;
		
		@FindBy(xpath="//button[@id='saveAsNewButton']")
		public WebElement saveasnew;

		public WebDriver driver;
		
		
		
		
		public login(WebDriver driver) {
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}	
	}

