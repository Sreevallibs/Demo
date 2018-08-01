package SeleniumGcReddy;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;


public class Dropdown_Operation {
	//Second Commit

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
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
		driver.findElement(By.cssSelector("#MainContent_TabContainer1_AnswerCall_ddlTypeofTrip_chosen")).click();
		
		
		Select dropDown=new Select(driver.findElement(By.id("MainContent_TabContainer1_AnswerCall_ddlTypeofTrip_chosen")));
		List<WebElement> e=dropDown.getOptions();
		int count=e.size();
		System.out.println(count);
		//dropDown.selectByValue("AIRPORT TO CITY");
		//dropDown.selectByIndex(4);
		//driver.findElement(By.cssSelector("#MainContent_TabContainer1_AnswerCall_ddlTypeofTrip_chosen")).click();
		



}
}