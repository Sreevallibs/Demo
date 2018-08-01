package SeleniumGcReddy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InLine_Operations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
		   WebDriver driver = new FirefoxDriver(); 
	
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   
		  driver.get("https://www.google.com/");
		 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[2]/div[1]/a")).click();
		  //driver.manage().window().maximize();
		  driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[2]/div[2]/a[1]")).click();
		  driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/div/div/div/div[2]/div[2]/div[2]/ul[2]/li[4]/a/span[1]")).click();

	}

}
