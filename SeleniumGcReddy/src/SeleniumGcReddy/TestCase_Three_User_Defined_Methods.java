package SeleniumGcReddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase_Three_User_Defined_Methods {
	public static WebDriver driver;
	public void Launch_Browser()
	{
		driver=new FirefoxDriver();
	}
	public void Skycab_Login()
	{
		driver.get("http://182.74.80.235/TDSSkycabs/");
		driver.findElement(By.name("txtUserId")).sendKeys("skycabsadmin");
		driver.findElement(By.name("txtPassword")).sendKeys("infodispatch");
		driver.findElement(By.name("btnLogin")).click();
	}
	public void Skycab_Login(String USN,String Pwd)
	{
		driver.get("http://182.74.80.235/TDSSkycabs/");
		driver.findElement(By.name("txtUserId")).sendKeys(USN);
		driver.findElement(By.name("txtPassword")).sendKeys(Pwd);
		driver.findElement(By.name("btnLogin")).click();
	}
	public void Close_Browser()
	{
		driver.close();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		TestCase_Three_User_Defined_Methods obj= new TestCase_Three_User_Defined_Methods();
		obj.Launch_Browser();
		obj.Skycab_Login();
		obj.Close_Browser();
		obj.Launch_Browser();
		obj.Skycab_Login("skycabsadmin","infodispatch");
		obj.Close_Browser();
		

	}

}
