package SeleniumGcReddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_Operation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver(); 
	        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	        driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	        //driver.switchTo().frame(2);
	        //driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();
	        driver.switchTo().frame("packageFrame");
	        driver.findElement(By.xpath("/html/body/div/ul/li[1]/a")).click();
	        Thread.sleep(2000);
	        driver.switchTo().defaultContent();
	        driver.switchTo().frame("packageListFrame");
	        driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
	        
	}

}
