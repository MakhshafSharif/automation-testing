package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lab07.login;

public class ExcelDataProvider {
	
	WebDriver driver=null;
	login login = new login(driver);
	/*
	@DataProvider(name="test1data")
	
	public Object getData() {
		String excelPath="C:/Users/4145/eclipse-workspace/HelloWorld/excel/data.xlsx";
		 
		return login.testData(excelPath , "Sheet1");
	}*/
	
	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//4145//Documents//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://baseline01.curemd.com/curemd/datLogin.asp"); 

	}
	@DataProvider
	@Test(dataProvider = "test1data")
	public void test1(String Username, String Password) {
		System.out.println(Username+" | "+Password);
		
	
		driver.findElement(By.id("vchLogin_Name")).sendKeys(Username);
		driver.findElement(By.id("vchPassword")).sendKeys(Password);
		
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		
		String projectPath = System.getProperty("user.dir");
		Object data[][] = testData("C://Users//4145//eclipse-workspace//HelloWorld//excel//data.xlsx", "Sheet1");
		return data;
	}
	
	public  Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++) {	//started with 1 because first is heading
			for(int j=0;j<colCount;j++) {	//started with 0 because first is data
				String cellData = excel.getCellDataString(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			//System.out.println();
		}
		return data;
	}
	
}


