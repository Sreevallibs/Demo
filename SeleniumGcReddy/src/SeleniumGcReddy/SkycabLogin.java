package SeleniumGcReddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SkycabLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver Driver=new FirefoxDriver();
		Actions action=new Actions(Driver);
		Driver.get("http://182.74.80.235/TDSSkycabs/index.aspx");
		Driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        Driver.findElement(By.id("txtUserId")).sendKeys("skycabsadmin");
        Driver.findElement(By.id("txtPassword")).sendKeys("infodispatch");
        Driver.findElement(By.id("btnLogin")).click();
        String Actual=Driver.getCurrentUrl();
        String Expected="http://182.74.80.235/TDSSkycabs/homepage.aspx";
        if(Actual.equalsIgnoreCase(Expected))
        {
        	System.out.println("Logged in Sucessfully");	
        }
        else
        {
        	System.out.println("Login Failed");
        }
        //action.moveToElement(Driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]"))).perform();//for mouse hover functionality
        Driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[2]")).click();
        Driver.findElement(By.linkText("Logout")).click();
        
        
	}

}
