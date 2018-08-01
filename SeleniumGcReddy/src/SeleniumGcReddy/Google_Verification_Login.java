package SeleniumGcReddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Verification_Login {
	public static WebDriver driver;
	 
	public void Launch()
	{
		driver = new FirefoxDriver();
		
	}
	public String Empty_Usn()
	{
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
	
		String str= driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/content/form/div[1]/div/div[2]/div[2]")).getText();
		return str;
	}
	
	public String Invalid_USN()
	{
		driver.get("https://accounts.google.com/");
		
		driver.findElement(By.id("identifierId")).sendKeys("sredsdsdsdevalli.bs");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		String str= driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/content/form/div[1]/div/div[2]/div[2]")).getText();
		return str;
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		Google_Verification_Login obj=new Google_Verification_Login();
		obj.Launch();
		String str1=obj.Empty_Usn();
		String str2=obj.Invalid_USN();
		System.out.println("Testcase 1: " + " Displays Error Message as "+ " \" " + str1 + " \" " + " for Empty Username" );
		System.out.println("Testcase 2: " + " Displays Error Message as "+ " \" " + str2 + " \" " + " for Invalid Username");
			   
		   
	}

}
