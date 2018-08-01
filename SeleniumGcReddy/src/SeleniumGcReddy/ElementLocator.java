package SeleniumGcReddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver Driver=new FirefoxDriver();
		//Driver.get("http://182.74.80.235/TDSSkycabs/index.aspx");
		//Driver.findElement(By.id("txtUserId")).sendKeys("skycabsadmin");
		//Driver.findElement(By.tagName("input")).sendKeys("skycabsadmin");
       // Driver.findElement(By.name("txtPassword")).sendKeys("infodispatch");
        //Driver.findElement(By.className("button")).click();
		
		//String str1=Driver.getPageSource();
		//System.out.println(str1);
		System.out.println(Driver.getCurrentUrl());
		//Driver.findElement(By.tagName("input")).sendKeys("Testing");
		//Driver.findElement(By.linkText("Gmail")).click();
		//Driver.findElement(By.partialLinkText("Gma")).click();
		//Driver.findElement(By.cssSelector("div.gb_Q:nth-child(1)")).click();
		//Driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[1]/div[1]/a")).click();
	}

	
	}


