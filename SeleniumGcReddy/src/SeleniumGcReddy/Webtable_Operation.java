package SeleniumGcReddy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_Operation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver(); 
	
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   
		  driver.get("http://182.74.80.235/TDSSkycabs/");
		  driver.findElement(By.id("txtUserId")).sendKeys("skycabsadmin");
			driver.findElement(By.name("txtPassword")).sendKeys("infodispatch");
			driver.findElement(By.id("btnLogin")).click();
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[3]/table/tbody/tr[1]/td/div[2]/table/tbody/tr[5]/td[4]")).getText());
			WebElement ele=driver.findElement(By.id("MainContent_gridview1"));
			
			List<WebElement> row=driver.findElements(By.tagName("tr"));
			int rowcount=row.size();
			System.out.println(rowcount);
			List<WebElement> col=driver.findElements(By.tagName("td"));
			int colcount=row.size();
			System.out.println(colcount);
	}

}
