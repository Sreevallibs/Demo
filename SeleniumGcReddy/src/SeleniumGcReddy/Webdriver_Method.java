package SeleniumGcReddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver Driver=new FirefoxDriver();
		//Driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Driver=new ChromeDriver();
	Driver.get("https://accounts.google.com/");
	Driver.findElement(By.id("identifierId")).sendKeys("sreevalli.bs");
	Driver.findElement(By.cssSelector("#identifierNext > content:nth-child(3) > span:nth-child(1)")).click();
	
	//String actual=Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[2]/div[2]")).getText();
	//String Expected="Couldn't find your Google Accountt";
	//System.out.println(Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/content/form/div[1]/div/div[2]/div[2]")).isDisplayed());
	/*if(actual==Expected)
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Not Present");
	}
	boolean a= Driver.findElement(By.id("identifierId")).isEnabled();
		System.out.println(a);*/
	Thread.sleep(2000);
		Driver.findElement(By.cssSelector("#password > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")).sendKeys("banahally@123");
		Thread.sleep(1000);
		Driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/content/span")).click();
		Driver.findElement(By.xpath("/html/body/div[2]/c-wiz/div/div/div[5]/div[2]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
		Driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[6]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/div/div")).click();
boolean bool=Driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[6]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[2]/div/div")).isSelected();
System.out.println(bool);
		//Driver.get("https://in.yahoo.com/");
		
		/*System.out.println(Driver.getCurrentUrl());
		Driver.navigate().to("https://in.yahoo.com/");
		System.out.println(Driver.getCurrentUrl());
		Driver.navigate().back();
		System.out.println(Driver.getCurrentUrl());
		Driver.navigate().forward();
		System.out.println(Driver.getCurrentUrl());
		/*String str=Driver.getTitle();
		System.out.println(str);
		String str1=Driver.getPageSource();
		System.out.println(str1);
		System.out.println(Driver.getCurrentUrl());*/
		/*Driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		Driver.navigate().refresh();
		Driver.close();*/
		//Driver.get("https://in.yahoo.com/");
		//Driver.close();
		//Driver.quit();
	}

}
