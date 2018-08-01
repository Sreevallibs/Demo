package Data_Driven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Data_Driven_Class {
	public WebDriver Driver;
	@AfterTest
	public void close()
	{
		Driver.close();
	}
	@Test(dataProvider="Test")
	
	public void login(String Usn,String Pwd)
	{
		
	System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
	Driver=new FirefoxDriver();
	Driver.get("http://182.74.80.235/TDSSkycabs/index.aspx");
	Driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    Driver.findElement(By.id("txtUserId")).sendKeys(Usn);
    Driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
    Driver.findElement(By.id("btnLogin")).click();
    Assert.assertEquals("http://182.74.80.235/TDSSkycabs/Homepage.aspx", Driver.getCurrentUrl());
    Driver.close();
	}
	
	@DataProvider (name="Test")
	public Object[][] readExcel() throws BiffException, IOException 
	//public static void main(String args[]) throws BiffException, IOException
	{
System.out.println("Test");
	
		File f=new File("D:/Test.xls");
		Workbook book=Workbook.getWorkbook(f);
		Sheet sheet=book.getSheet("Sheet1");
		int row=sheet.getRows();
		int column=sheet.getColumns();
	String inputdata[][]=new String[row][column];
	for(int i=0;i<row;i++)
	{
		
		
		for(int j=0;j<column;j++)
		{
		
			
			{
			Cell c=sheet.getCell(j,i);
			inputdata[i][j]=c.getContents();
			//System.out.println(inputdata[i][j]);
			}
		}
			
		}
	
	
	return inputdata;

}
	
	
}
