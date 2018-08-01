package SeleniumGcReddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupMesg_Operation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver(); 
	
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   
		  driver.get("http://182.74.80.235/TDSSkycabs/");
		  driver.findElement(By.id("txtUserId")).sendKeys("skycabsadmin");
			driver.findElement(By.name("txtPassword")).sendKeys("infodispatch");
			driver.findElement(By.id("btnLogin")).click();
		  Actions action=new Actions(driver);
			Thread.sleep(2000);
			WebElement ele=driver.findElement(By.linkText("Call Center"));
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/ul[1]/li[3]/ul/li[1]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='MainContent_TabContainer1_AnswerCall_btnbook']")).click();
	      Alert alert=driver.switchTo().alert();
	      Thread.sleep(2000);
	      alert.dismiss();

	}

}
