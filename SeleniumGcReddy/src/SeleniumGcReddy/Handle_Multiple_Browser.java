package SeleniumGcReddy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handle_Multiple_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver(); 
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/form[1]/div[1]/span[2]/a")).click();
	        String parent=driver.getWindowHandle();
	        //System.out.println(parent);
	        Set<String> handle=driver.getWindowHandles();
	        String[] array = handle.toArray(new String[1]);
	        System.out.println(array[0]);
	        
	        System.out.println(array[1]);
	       /* for(String ii:stringList)
	        {
	        	System.out.println(ii);
	        }*/
	      
	        //System.out.println(list.toString());
	        
	        int count=handle.size();
	        System.out.println(count);
	        for(String i:handle)
	        {
	        	if(!i.equals(parent))
	        	{
	        		driver.switchTo().window(i);
	        		System.out.println(driver.getCurrentUrl());
	        	}
	        }
driver.switchTo().window("4294967297");
System.out.println(driver.getCurrentUrl());
	}

}
